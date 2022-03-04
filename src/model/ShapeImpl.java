package model;

public class ShapeImpl implements IShape {

  private Shape2D type;
  private Point2D reference;
  private double width;
  private double height;
  private Color color;


  public ShapeImpl(Shape2D type, Point2D reference, double width, double height, Color color) {
    if (type == null || reference == null || color == null || width <= 0 || height <= 0) {
      throw new IllegalArgumentException("invalid parameter provided");
    }
    this.type = type;
    this.reference = reference;
    this.color = color;
    this.width = width;
    this.height = height;
  }

  @Override
  public Shape2D getType() {
    return null;
  }

  @Override
  public Point2D getReference() {
    return reference;
  }

  @Override
  public double getWidth() {
    return width;
  }

  @Override
  public double getHeight() {
    return height;
  }

  @Override
  public Color getColor() {
    return color;
  }

  @Override
  public IShape copy() {
    return new ShapeImpl(type, reference, width, height, color);
  }

  @Override
  public String toString() {
    String str = "Type: ";
    switch (type) {
      case OVAL:
        str += "oval\n" + String.format("Center: %s, X radius: %1f, Y radius: %1f",
              reference.toString(), width, height) + color.toString();
        break;
      default:
        str += String.format("\nCenter: %s, X radius: %1f, Y radius: %1f", type.toString(),
                reference.toString(), width, height) + color.toString();
        break;
    }
    return str;

  }

}
