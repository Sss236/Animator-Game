package model;

/**
 * This class represents a 2D point. This point is denoted in Cartesian
 * coordinates as (x,y).
 */
public final class Point2D {
  private final double x;
  private final double y;

  /**
   * Construct a 2d point with the given coordinates
   * @param x the x-coordinate of this point
   * @param y the y-coordinate of this point
   */
  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Return the x-coordinate of this point
   * @return x-coordinate of this point
   */
  public double getX() {
    return x;
  }

  /**
   * Return the y-coordinate of this point
   * @return y-coordinate of this point
   */
  public double getY() {
    return y;
  }

  public String toString() {
    return String.format("(%1f, %1f)", x, y);
  }

}