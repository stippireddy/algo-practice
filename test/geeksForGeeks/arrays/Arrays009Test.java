package geeksForGeeks.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Arrays009Test {

  @Test
  public void mergeArrays() {
    Arrays009 a = new Arrays009();
    testHelper(
        a,
        new int[] {2, 8, -1, -1, -1, 13, -1, 15, 20},
        new int[] {5, 7, 9, 25},
        new int[] {2, 5, 7, 8, 9, 13, 15, 20, 25});
    testHelper(a, new int[] {2, 8, 13, 15, 20}, new int[] {}, new int[] {2, 8, 13, 15, 20});
    testHelper(
        a,
        new int[] {-1, -1, -1, -1, -1},
        new int[] {2, 8, 13, 15, 20},
        new int[] {2, 8, 13, 15, 20});
    testHelper(
        a,
        new int[] {-1, 2, 8, -1, 14, -1, 15, -1, 20, -1},
        new int[] {2, 8, 13, 15, 20},
        new int[] {2, 2, 8, 8, 13, 14, 15, 15, 20, 20});
  }

  private void testHelper(Arrays009 a, int[] input1, int[] input2, int[] result) {
    a.mergeArrays(input1, input2);
    assertEquals(input1, result);
  }
}
