package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class MergeIntervalsTest {

  @Test
  public void insert() {
    MergeIntervals m = new MergeIntervals();
    m.insert(new ArrayList<>(Arrays.asList(
        new MergeIntervals.Interval(3, 6),
        new MergeIntervals.Interval(8, 9))), new MergeIntervals.Interval(7, 10));
  }
}
