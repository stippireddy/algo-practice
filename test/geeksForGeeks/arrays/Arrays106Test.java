package geeksForGeeks.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Arrays106Test {

  @Test
  public void minLengthSubArray() {
    Arrays106 a = new Arrays106();
    assertEquals(a.minLengthSubArray(new int[] {1, 4, 45, 6, 0, 19}, 51), 3);
    assertEquals(a.minLengthSubArray(new int[] {1, 10, 5, 2, 7}, 9), 1);
    assertEquals(a.minLengthSubArray(new int[] {58, 82, 124, 130, 297}, 174), 1);
    assertEquals(a.minLengthSubArray(new int[] {5, 4, -8, 16}, 10), 1);
    assertEquals(a.minLengthSubArray(new int[] {5, 3, 1, -8, 16}, 10), 1);
    assertEquals(a.minLengthSubArray(new int[] {5, 3, 1, -28, 16}, 10), 1);
    assertEquals(a.minLengthSubArray(new int[] {5, 3, 1, -8, 10}, 10), 5);
    assertEquals(a.minLengthSubArray(new int[] {5, 3, 1, -8, 9, 2}, 10), 2);
    assertEquals(a.minLengthSubArray(new int[] {5, 3, 1, -18, 9, 2}, 10), 2);
  }
}
