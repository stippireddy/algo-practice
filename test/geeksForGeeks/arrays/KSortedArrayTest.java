package geeksForGeeks.arrays;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class KSortedArrayTest {

  @Test
  public void isKSorted() {
    KSortedArray testObj = new KSortedArray();
    assertTrue(testObj.isKSorted(new int[] {3, 2, 1, 5, 6, 4}, 2));
    assertFalse(testObj.isKSorted(new int[] {13, 8, 10, 7, 15, 14, 12}, 3));
    assertTrue(testObj.isKSorted(new int[] {7, 8, 10, 12, 13, 14, 15}, 0));
    assertTrue(testObj.isKSorted(new int[] {}, 10));
    assertFalse(testObj.isKSorted(new int[] {12, 8, 10, 13, 14, 15, 7}, 4));
    assertTrue(testObj.isKSorted(new int[] {15, 14, 13, 12, 10, 8, 7}, 6));
  }
}
