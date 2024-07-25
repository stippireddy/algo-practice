package leetcode;

public class Leetcode3101 {
    /*
        We keep track of two indices - start and end.
        The array between start and end is always alternating. The number of subarrays ending in end and alternating
        are end - start + 1.
        If the current index does not allow to extend an alternating subarray, make start = end.
     */
    public long countAlternatingSubarrays(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        long result = 1;
        int i = 0, j = 1;
        for (; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) {
                i = j;
            }
            result += j - i + 1;
        }
        return result;
    }
}
