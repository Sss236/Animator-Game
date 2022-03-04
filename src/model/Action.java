package model;

interface Action {

  TimePeriod getActionTime();

  void changeOldShape(IShape shape);

  IShape getNewShape();

  IShape getShapeAtTick(int tick);
}
