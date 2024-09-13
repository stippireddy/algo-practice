package leetcode;

public class Leetcode1060 {
    public int missingElement(int[] nums, int k) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low + 1) / 2;
            int missingNumbers = nums[mid] - nums[low] - mid + low;
            if (missingNumbers >= k) {
                high = mid - 1;
            } else {
                low = mid;
                k -= missingNumbers;
            }
        }
        return nums[low] + k;
    }
}
