package leetcode;

import java.util.Random;

public class Leetcode215 {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, k, 0, nums.length - 1);
    }

    private int findKthLargest(int[] nums, int k, int start, int end) {
        int selectedIndex = start + new Random().nextInt(end - start + 1);
        swap(nums, selectedIndex, start);
        int selected = nums[start];
        int i = start + 1, j = end;
        while (i <= j) {
            if (nums[j] < selected) {
                j--;
            } else {
                swap(nums, j, i);
                i++;
            }
        }
        swap(nums, j, start);
        int rank = j - start + 1;
        if (rank == k) {
            return nums[j];
        } else if (rank > k) {
            return findKthLargest(nums, k, start, j - 1);
        } else {
            return findKthLargest(nums, k - (rank), j + 1, end);
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
