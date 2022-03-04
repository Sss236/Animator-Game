package model;

public class Color {
  private final int r;
  private final int g;
  private final int b;

  public Color(int r, int g, int b) throws IllegalArgumentException {
    if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
      throw new IllegalArgumentException("...");
    }
    this.r = r;
    this.g = g;
    this.b = b;
  }

  public String toString() {
    return String.format("(%d, %d, %d)", r, g, b);
  }
}
