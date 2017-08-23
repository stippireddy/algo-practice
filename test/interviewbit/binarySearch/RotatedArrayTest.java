package interviewbit.binarySearch;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class RotatedArrayTest {

  @Test
  public void findMin() {
    RotatedArray r = new RotatedArray();
    assertEquals(0, r.findMin(new ArrayList<Integer>(Arrays.asList(7, 0, 1, 2, 3, 4, 5, 6))));
    assertEquals(0, r.findMin(new ArrayList<Integer>(Arrays.asList(6, 7, 0, 1, 2, 3, 4, 5))));
    assertEquals(0, r.findMin(new ArrayList<Integer>(Arrays.asList(5, 6, 7, 0, 1, 2, 3, 4))));
    assertEquals(0, r.findMin(new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3))));
    assertEquals(0, r.findMin(new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 7, 0, 1, 2))));
    assertEquals(0, r.findMin(new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7, 0, 1))));
    assertEquals(0, r.findMin(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 0))));
    assertEquals(0, r.findMin(new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7))));
    assertEquals(0, r.findMin(new ArrayList<Integer>(Arrays.asList(0, 1))));
    assertEquals(0, r.findMin(new ArrayList<Integer>(Arrays.asList(1, 0))));
  }
}
