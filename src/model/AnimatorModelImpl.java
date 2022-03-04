package model;

import java.util.List;
import java.util.Map;

public class AnimatorModelImpl implements AnimatorModel {

  private Map<String, AnimateShape> allShapes;

  @Override
  public void addShape(String identifier, IShape shape) {

  }

  @Override
  public void removeShape(String identifier, IShape shape) {

  }

  @Override
  public void scale(String identifier, double x, double y, int start, int end) {

  }

  @Override
  public void color(String identifier, Color color, int start, int end) {

  }

  @Override
  public IShape getShape(String identifier) {
    return null;
  }

  @Override
  public List<IShape> getShapeAtTick(int tick) {
    return null;
  }
}
