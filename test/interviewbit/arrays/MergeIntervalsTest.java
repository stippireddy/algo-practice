package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class MergeIntervalsTest {

  @Test
  public void insert() {
    MergeIntervals m = new MergeIntervals();
    m.insert(
        new ArrayList<Interval>(Arrays.asList(new Interval(3, 6), new Interval(8, 9))),
        new Interval(7, 10));
  }
}
