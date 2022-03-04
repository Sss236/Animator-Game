package model;

public interface IShape {

  Shape2D getType();

  Point2D getReference();

  double getWidth();

  double getHeight();

  Color getColor();

  IShape copy();
}
