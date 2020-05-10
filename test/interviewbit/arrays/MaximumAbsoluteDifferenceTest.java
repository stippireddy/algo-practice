package interviewbit.arrays;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class MaximumAbsoluteDifferenceTest {

  @Test
  public void maxArr0() {
    MaximumAbsoluteDifference m = new MaximumAbsoluteDifference();
    assertEquals(
        m.maxArr0(new ArrayList<Integer>(Arrays.asList(8, 1, 6, 7, 12, 3, 4, 9, 11, 15))), 22);
    assertEquals(
        22, m.maxArr0(new ArrayList<Integer>(Arrays.asList(9, 1, 6, 7, 12, 3, 16, 9, 11, 15))));

    assertEquals(
        33, m.maxArr0(new ArrayList<Integer>(Arrays.asList(9, 1, 6, -7, 12, 3, -16, 9, 11, -15))));
  }

  @Test
  public void maxArr1() {
    MaximumAbsoluteDifference m = new MaximumAbsoluteDifference();
    assertEquals(
        m.maxArr1(new ArrayList<Integer>(Arrays.asList(8, 1, 6, 7, 12, 3, 4, 9, 11, 15))), 22);
    assertEquals(
        22, m.maxArr1(new ArrayList<Integer>(Arrays.asList(9, 1, 6, 7, 12, 3, 16, 9, 11, 15))));

    assertEquals(
        33, m.maxArr1(new ArrayList<Integer>(Arrays.asList(9, 1, 6, -7, 12, 3, -16, 9, 11, -15))));
  }
}
