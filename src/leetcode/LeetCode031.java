package leetcode;

import java.util.Arrays;

public class LeetCode031 {

  public static void main(String[] args) {
    LeetCode031 l = new LeetCode031();
    int[] array = {8, 7, 5};
    l.nextPermutation(array);
    System.out.println(Arrays.toString(array));
  }

  public void nextPermutation(int[] nums) {
    int i = nums.length - 1;
    for (; i > 0; i--) {
      if (nums[i] > nums[i - 1]) {
        break;
      }
    }
    Arrays.sort(nums, i, nums.length);
    if (i == 0) {
      return;
    }
    int j = i;
    while (j < nums.length && nums[j] <= nums[i - 1]) {
      j++;
    }
    int temp = nums[i - 1];
    nums[i - 1] = nums[j];
    nums[j] = temp;
  }
}
