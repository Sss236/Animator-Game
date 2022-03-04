package model;

// TODO:

class Scale extends AbstractAction {

  private Point2D oldPosition;
  private double Height;
  private double Width;
  public Scale(IShape oldShape, TimePeriod actionPeriod,int height,int width) {
    super(oldShape, actionPeriod);
    this.height = height;
    this.width = width;
  }

  @Override
  public IShape getShapeAtTick(int tick) {
    int duration = actionPeriod.duration();
    int tickInAction = tick - actionPeriod.getStart();
    double midHeight = oldShape.getHeight() + (this.height-oldShape.getHeight()) / duration * tickInAction;
    double midWidth = oldShape.getWidth() + (this.width-oldShape.getWidth())/ duration * tickInAction;
    IShape midShape =
    return new ShapeImpl(type, midPosition, width, height, color);
  }

  @Override
  public String toString() {
    return "";
  }

}
