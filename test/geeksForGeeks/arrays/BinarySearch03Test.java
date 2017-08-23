package geeksForGeeks.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class BinarySearch03Test {

  @Test
  public void findElementInRotatedArray() {
    BinarySearch03 b = new BinarySearch03();
    assertEquals(0, b.findElementInRotatedArray(new int[] {0}, 0));
    assertEquals(0, b.findElementInRotatedArray(new int[] {0, 1}, 0));
    assertEquals(1, b.findElementInRotatedArray(new int[] {1, 0}, 0));
    assertEquals(0, b.findElementInRotatedArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 1));
    assertEquals(7, b.findElementInRotatedArray(new int[] {2, 3, 4, 5, 6, 7, 8, 1}, 1));
    assertEquals(6, b.findElementInRotatedArray(new int[] {3, 4, 5, 6, 7, 8, 1, 2}, 1));
    assertEquals(5, b.findElementInRotatedArray(new int[] {4, 5, 6, 7, 8, 1, 2, 3}, 1));
    assertEquals(4, b.findElementInRotatedArray(new int[] {5, 6, 7, 8, 1, 2, 3, 4}, 1));
    assertEquals(3, b.findElementInRotatedArray(new int[] {6, 7, 8, 1, 2, 3, 4, 5}, 1));
    assertEquals(2, b.findElementInRotatedArray(new int[] {7, 8, 1, 2, 3, 4, 5, 6}, 1));
    assertEquals(1, b.findElementInRotatedArray(new int[] {8, 1, 2, 3, 4, 5, 6, 7}, 1));
  }
}
