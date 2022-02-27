package xis;

public class LeetCode215 {

  public int findKthLargest(int[] nums, int k) {
    return helper(nums, k, 0, nums.length - 1);
  }

  private int helper(int[] nums, int k, int left, int right) {
    int pivot = nums[left];
    int i = left + 1, j = right;
    while (i <= j) {
      if (nums[i] >= pivot) {
        i++;
      } else {
        swap(nums, i, j);
        j--;
      }
    }
    swap(nums, left, i - 1);
    int rank = i - left;
    if (rank == k) {
      return pivot;
    }
    if (rank > k) {
      return helper(nums, k, left, i - 2);
    }
    return helper(nums, k - rank, i, right);
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}