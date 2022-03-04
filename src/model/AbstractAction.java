package model;


abstract class AbstractAction implements Action {
  protected IShape oldShape;
  protected TimePeriod actionPeriod;
  protected Point2D position;
  protected Shape2D type;
  protected double width;
  protected double height;
  protected Color color;

  public AbstractAction(IShape oldShape, TimePeriod actionPeriod) {
    this.oldShape = oldShape;
    this.actionPeriod = actionPeriod;
    this.position = oldShape.getReference();
    this.type = oldShape.getType();
    this.width = oldShape.getWidth();
    this.height = oldShape.getHeight();
    this.color = oldShape.getColor();
  }

  @Override
  public TimePeriod getActionTime() {
    return actionPeriod;
  }

  @Override
  public IShape getNewShape() {
    return new ShapeImpl(type, position, width, height, color);
  }

  @Override
  public void changeOldShape(IShape shape) {
    this.position = shape.getReference();
    this.type = shape.getType();
    this.width = shape.getWidth();
    this.height = shape.getHeight();
    this.color = shape.getColor();
  }
}
