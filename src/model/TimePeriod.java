package model;

class TimePeriod implements Comparable<TimePeriod> {
  private int start;
  private int end;

  public TimePeriod(int start, int end) {
    if(start < 0 || end < 0 || start >= end) {
      throw new IllegalArgumentException("invalid timeline");
    }
    this.start = start;
    this.end = end;
  }

  public int duration() {
    return end - start;
  }

  public int getStart() {
    return start;
  }

  public int getEnd() {
    return end;
  }

  public boolean isWithin(TimePeriod d) {
    if (d == null) {
      throw new IllegalArgumentException("invalid parameter provided");
    }
    return d.start >= start && d.end >= end;
  }

  public boolean isOverlap(TimePeriod d) {
    if (d == null) {
      throw new IllegalArgumentException("invalid parameter provided");
    }
    return d.start < end || d.end > start;
  }

  public boolean isAfter(TimePeriod d) {
    if (d == null) {
      throw new IllegalArgumentException("invalid parameter provided");
    }
    return this.start >= d.end;
  }

  public String toString() {
    return String.format("from t=%d to t=%d", start, end);
  }

  @Override
  public int compareTo(TimePeriod t) {
    if (t == null) {
      throw new IllegalArgumentException("invalid parameter provided");
    }
    if (start < t.end) {
      return -1;
    } else if (start > t.start) {
      return 1;
    } else {
      return 0;
    }
  }
}
