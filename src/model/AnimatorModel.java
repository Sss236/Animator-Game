package model;

import java.util.List;

public interface AnimatorModel {
  void addShape(String identifier, IShape shape);

  void removeShape(String identifier, IShape shape);

  void scale(String identifier, double x, double y, int start, int end);

  void color(String identifier, Color color, int start, int end);

  IShape getShape(String identifier);

  List<IShape> getShapeAtTick(int tick);

}
