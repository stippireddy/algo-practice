package leetCode;

public class Interval {

  int start;
  int end;

  public Interval() {
    start = 0;
    end = 0;
  }

  public Interval(int s, int e) {
    start = s;
    end = e;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj.getClass() != Interval.class) {
      return false;
    }
    Interval i = (Interval) obj;
    return this.start == i.start && this.end == i.end;
  }
}
