package model;

public enum Shape2D {
  OVAL("Oval"), RECTANGLE("Rectangle");

  private final String name;

  Shape2D(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
