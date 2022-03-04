package model;

import model.IShape;
import model.Point2D;
import model.ShapeImpl;
import model.TimePeriod;

class Move extends AbstractAction {

  private Point2D oldPosition;

  public Move(IShape oldShape, Point2D point, TimePeriod actionPeriod) {
    super(oldShape, actionPeriod);
    this.oldPosition = oldShape.getReference();
    this.position = point;
  }

  @Override
  public String toString() {
    return String.format("move from %s to %s %s", oldPosition, position, actionPeriod.toString());
  }

  @Override
  public IShape getShapeAtTick(int tick) {
    // TODO: check within time
    int duration = actionPeriod.duration();
    int tickInAction = tick - actionPeriod.getStart();
    double x = oldPosition.getX() + (position.getX() - oldPosition.getX()) / duration * tickInAction;
    double y = oldPosition.getY() + (position.getY() - oldPosition.getY()) / duration * tickInAction;
    Point2D midPosition = new Point2D(x, y);
    return new ShapeImpl(type, midPosition, width, height, color);
  }
}
