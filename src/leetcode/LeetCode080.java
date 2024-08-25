package leetcode;

public class LeetCode080 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            int k = nums[j];
            int count = 0;
            while (j < nums.length && nums[j] == k) {
                j++;
                count++;
            }
            count = Integer.min(2, count);
            while (count-- > 0) {
                nums[i] = k;
                i++;
            }
        }
        return i;
    }
}
