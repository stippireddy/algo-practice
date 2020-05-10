package interviewbit.arrays;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class MergeOverlappingIntervalsTest {

  @Test
  public void merge() {
    MergeOverlappingIntervals m = new MergeOverlappingIntervals();
    ArrayList<Interval> result =
        m.merge(
            new ArrayList<Interval>(
                Arrays.asList(
                    new Interval(1, 3),
                    new Interval(2, 6),
                    new Interval(8, 9),
                    new Interval(10, 11))));
    assertEquals(
        result,
        new ArrayList<Interval>(
            Arrays.asList(new Interval(1, 6), new Interval(8, 9), new Interval(10, 11))));
    result =
        m.merge(
            new ArrayList<Interval>(
                Arrays.asList(
                    new Interval(1, 3),
                    new Interval(2, 6),
                    new Interval(8, 10),
                    new Interval(10, 11))));
    assertEquals(
        result, new ArrayList<Interval>(Arrays.asList(new Interval(1, 6), new Interval(8, 11))));
    result =
        m.merge(
            new ArrayList<Interval>(
                Arrays.asList(
                    new Interval(1, 3),
                    new Interval(4, 6),
                    new Interval(8, 9),
                    new Interval(10, 11))));
    assertEquals(
        result,
        new ArrayList<Interval>(
            Arrays.asList(
                new Interval(1, 3), new Interval(4, 6), new Interval(8, 9), new Interval(10, 11))));
    result =
        m.merge(
            new ArrayList<Interval>(
                Arrays.asList(
                    new Interval(1, 3),
                    new Interval(4, 6),
                    new Interval(8, 11),
                    new Interval(10, 15))));
    assertEquals(
        result,
        new ArrayList<Interval>(
            Arrays.asList(new Interval(1, 3), new Interval(4, 6), new Interval(8, 15))));
    result =
        m.merge(
            new ArrayList<Interval>(
                Arrays.asList(
                    new Interval(1, 20),
                    new Interval(4, 6),
                    new Interval(8, 11),
                    new Interval(10, 15))));
    assertEquals(result, new ArrayList<Interval>(Arrays.asList(new Interval(1, 20))));
  }
}
