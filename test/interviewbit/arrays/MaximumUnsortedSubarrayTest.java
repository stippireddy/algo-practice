package interviewbit.arrays;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class MaximumUnsortedSubarrayTest {

  @Test
  public void subUnsort() {
    MaximumUnsortedSubarray m = new MaximumUnsortedSubarray();
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(1, 2)),
        m.subUnsort(new ArrayList<Integer>(Arrays.asList(1, 3, 2, 4, 5))));
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(1, 3)),
        m.subUnsort(new ArrayList<Integer>(Arrays.asList(1, 6, 5, 2, 7))));
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(1, 4)),
        m.subUnsort(new ArrayList<Integer>(Arrays.asList(1, 6, 7, 5, 2))));
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(1, 8)),
        m.subUnsort(new ArrayList<Integer>(Arrays.asList(1, 5, 6, 10, 11, 12, 7, 4, 3))));
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(-1)),
        m.subUnsort(new ArrayList<Integer>(Arrays.asList(1))));
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(-1)),
        m.subUnsort(new ArrayList<Integer>(Arrays.asList(10, 11, 18))));
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(4, 10)),
        m.subUnsort(
            new ArrayList<Integer>(Arrays.asList(1, 1, 10, 10, 15, 10, 15, 10, 10, 15, 10, 15))));
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(1, 3)),
        m.subUnsort(new ArrayList<Integer>(Arrays.asList(4, 15, 4, 4, 15, 18, 20))));
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(11, 14)),
        m.subUnsort(
            new ArrayList<Integer>(
                Arrays.asList(3, 3, 4, 5, 5, 9, 11, 13, 14, 15, 15, 16, 15, 20, 16))));
  }
}
