package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class AnimateShape {

  private IShape shape;
  private TimePeriod appearTime;
  private List<Action> script;

  public AnimateShape(IShape shape, TimePeriod appearTime) {
    // appear < disappear
    this.shape = shape;
    this.appearTime = appearTime;
    script = new ArrayList<>();
  }

  public void move(Point2D position, TimePeriod period) {
    script.add(new Move(shape, position, period));
  }

  public void scale() {
    //todo
  }

  public void color() {
    //todo
  }

  public boolean isAppear(TimePeriod period) {
    return period.isWithin(appearTime);
  }

  private boolean isAppear(int tick) {
    return tick >= appearTime.getStart() && tick <= appearTime.getEnd();
  }

  public IShape getShape(int tick) {
    if (!isAppear(tick)) {
      return null;
    }
    if (script.size() == 0) {
      return shape;
    }
    return runScript(tick);
  }

  private IShape runScript(int tick) {
    // TODO: 1.sort 2. iterate script->get shape update 3. return shape at tick
    return null;
  }

  public String toString() {
    return shape.toString()
            + String.format("\nAppears at t=%d\nDisappears at t=%d\n"
            , appearTime.getStart(), appearTime.getEnd());
  }
}
