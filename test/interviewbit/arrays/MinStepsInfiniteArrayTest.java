package interviewbit.arrays;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class MinStepsInfiniteArrayTest {

  @Test
  public void coverPoints() {
    MinStepsInfiniteArray m = new MinStepsInfiniteArray();
    assertEquals(
        m.coverPoints(
            new ArrayList<>(Arrays.asList(1, 2, 2, 4)), new ArrayList<>(Arrays.asList(1, 2, 3, 3))),
        4);
    assertEquals(
        m.coverPoints(
            new ArrayList<>(Arrays.asList(1, 2, 2, 1)), new ArrayList<>(Arrays.asList(1, 2, 3, 1))),
        4);
    assertEquals(
        m.coverPoints(new ArrayList<>(Arrays.asList(1, 1)), new ArrayList<>(Arrays.asList(1, 1))),
        0);
    assertEquals(
        m.coverPoints(
            new ArrayList<>(Arrays.asList(1, 2, 2, 3)), new ArrayList<>(Arrays.asList(1, 2, 3, 3))),
        3);
    assertEquals(
        m.coverPoints(
            new ArrayList<>(Arrays.asList(1, 10, 25, 1)),
            new ArrayList<>(Arrays.asList(1, 10, 25, 1))),
        48);
    assertEquals(
        m.coverPoints(new ArrayList<>(Arrays.asList(1, 10)), new ArrayList<>(Arrays.asList(1, 10))),
        9);
    assertEquals(
        m.coverPoints(new ArrayList<>(Arrays.asList(1, 6)), new ArrayList<>(Arrays.asList(1, 10))),
        9);
  }
}
