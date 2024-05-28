package leetcode;

public class Leetcode88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1; i >= n; i--) {
            nums1[i] = nums1[i - n];
        }
        int i = n, j = 0, k = 0;
        while (j < n && i < m + n) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums2[j];
                j++;
            } else {
                nums1[k] = nums1[i];
                i++;
            }
            k++;
        }
        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}
