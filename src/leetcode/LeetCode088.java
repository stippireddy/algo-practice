package leetcode;

public class LeetCode088 {

  /**
   * @param n <p>The final result is that all the elements from nums2 are added to nums1 so that it
   * forms a sorted array. This method is inefficient as the elements in nums1 are shifted whenever
   * an insert is to be made.
   */
  public void mergeInefficient(int[] nums1, int m, int[] nums2, int n) {
    int i = 0, j = 0;
    while (i < m && j < n) {
      if (nums1[i] > nums2[j]) {
        for (int k = m; k > i; k--) {
          nums1[k] = nums1[k - 1];
        }
        nums1[i] = nums2[j];
        m = m + 1;
        j++;
      }
      i++;
    }
    while (j < n) {
      nums1[i++] = nums2[j++];
    }
  }

  public void mergeEfficient(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1, j = n - 1;
    int k = m + n - 1;
    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[k] = nums1[i];
        i--;
      } else if (nums1[i] <= nums2[j]) {
        nums1[k] = nums2[j];
        j--;
      }
      k--;
    }
    while (i >= 0) {
      nums1[k--] = nums1[i--];
    }
    while (j >= 0) {
      nums1[k--] = nums2[j--];
    }
  }
}
