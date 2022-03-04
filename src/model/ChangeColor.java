package model;

//TODO:

class ChangeColor extends AbstractAction {
  public ChangeColor(IShape oldShape, TimePeriod actionPeriod) {
    super(oldShape, actionPeriod);
  }

  @Override
  public IShape getShapeAtTick(int tick) {
    return null;
  }

  @Override
  public String toString() {
    return "";
  }
}
