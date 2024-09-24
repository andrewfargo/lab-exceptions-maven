package edu.grinnell.csc207.main;

import edu.grinnell.csc207.util.Quadratic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    // ...

    pen.println("Hi! I'm here to help you understand quadratic functions.");

    pen.print("Please enter a (squared term): ");
    pen.flush();
    int a = Integer.parseInt(eyes.readLine());

    pen.print("Please enter b (linear term): ");
    pen.flush();
    int b = Integer.parseInt(eyes.readLine());

    pen.print("Please enter c (constant term): ");
    pen.flush();
    int c = Integer.parseInt(eyes.readLine());

    Quadratic input = new Quadratic(a,b,c);
    double root = input.smallerRoot();

    pen.println("The smaller root of " + input + " is " + root);

    pen.println("Experimentally, " + input.toString((int) root) + " = " + input.evaluate(root));

    eyes.close();
    pen.close();
  } // main(String[])

} // QR
