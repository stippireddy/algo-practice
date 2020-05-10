package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode088Test {

  @Test
  public void mergeInefficient() {
    LeetCode088 l = new LeetCode088();
    testHelperInefficient(
        l,
        new int[]{1, 3, 5, 7, 10, 0, 0, 0, 0, 0},
        5,
        new int[]{2, 4, 6, 8, 9},
        5,
        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    testHelperInefficient(
        l,
        new int[]{1, 2, 3, 4, 5, 6, 0, 0, 0, 0},
        6,
        new int[]{7, 8, 9, 10},
        4,
        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    testHelperInefficient(l, new int[]{1}, 1, new int[]{}, 0, new int[]{1});
    testHelperInefficient(l, new int[]{0}, 0, new int[]{1}, 1, new int[]{1});
    testHelperInefficient(
        l, new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6});
  }

  private void testHelperInefficient(
      LeetCode088 l, int[] nums1, int m, int[] nums2, int n, int[] expectedResult) {
    l.mergeInefficient(nums1, m, nums2, n);
    assertEquals(expectedResult, nums1);
  }

  @Test
  public void mergeEfficient() {
    LeetCode088 l = new LeetCode088();
    testHelperEfficient(
        l,
        new int[]{1, 3, 5, 7, 10, 0, 0, 0, 0, 0},
        5,
        new int[]{2, 4, 6, 8, 9},
        5,
        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    testHelperEfficient(
        l,
        new int[]{1, 2, 3, 4, 5, 6, 0, 0, 0, 0},
        6,
        new int[]{7, 8, 9, 10},
        4,
        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    testHelperEfficient(l, new int[]{1}, 1, new int[]{}, 0, new int[]{1});
    testHelperEfficient(l, new int[]{0}, 0, new int[]{1}, 1, new int[]{1});
    testHelperEfficient(
        l, new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6});
  }

  private void testHelperEfficient(
      LeetCode088 l, int[] nums1, int m, int[] nums2, int n, int[] expectedResult) {
    l.mergeEfficient(nums1, m, nums2, n);
    assertEquals(expectedResult, nums1);
  }
}
