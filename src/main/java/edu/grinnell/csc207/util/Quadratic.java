package edu.grinnell.csc207.util;

/**
 * Quadratic expressions (of the form ax^2 + bx + c).
 *
 * @author Samuel A. Rebelsky
 * @author YOUR NAME HERE
 * @author YOUR NAME HERE
 */
public class Quadratic {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The coefficient of the x^2 component.
   */
  int a;

  /**
   * The coefficient of the x component.
   */
  int b;

  /**
   * The constant.
   */
  int c;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new quadratic.
   *
   * @param squared
   *   The coefficient of the squared term.
   * @param linear
   *   The coefficient of the linear term.
   * @param constant
   *   The constant.
   */
  public Quadratic(int squared, int linear, int constant) throws Exception{
    this.a = squared;
    this.b = linear;
    this.c = constant;
  } // Quadratic(int, int, int)

  // +------------------+--------------------------------------------
  // | Standard Methods |
  // +------------------+

  /**
   * Convert to a string.
   *
   * @return the function as a string
   */
  public String toString() {
    return String.format("%dx^2 + %dx + %d", a, b, c);
  } // toString()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Build a string that shows the expression with a particular value.
   *
   * @param val
   *   The value we incorporate in the expression.
   *
   * @return the expression as a string
   */
  public String toString(int val) {
    return String.format("%d*%d^2 + %d*%d + %d", a, val, b, val, c);
  } // toString(double)

  /**
   * Evaluate the quadratic on a value.
   *
   * @param x
   *   The value on which to evaluate the quadratic.
   *
   * @return the value
   */
  public double evaluate(double x) {
    return ((double) this.a) * x * x + ((double) this.b) * x + ((double) this.c);
  } // evaluate(double)

  /**
   * Find the smaller of the two roots.
   *
   * @return the smaller of the two roots (or the only root, if there
   *   is only one).
   */
  public double smallerRoot() throws Exception {
    return (((-1 * b) - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
  } // smallerRoot

  /**
   * Find the larger of the two roots.
   *
   * @return the larger of the two roots (or the only root, if there
   *   is only one).
   */
  public double largerRoot() {
    return 0.0; // STUB
  } // largerRoot
} // class Quadratic
