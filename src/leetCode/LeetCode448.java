package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {

  /**
   * @return a list of integers that are absent from the sequence of [1, nums.length]
   * <p>The challenge is to implement the function in O(n) time using constant space. This
   * implementation makes at most n swaps to make sure that all the numbers are in their respective
   * indices. Note that the index of number n is n-1. Then we output numbers that are mismatched at
   * the indices they are supposed to appear.
   */
  public List<Integer> findDisappearedNumbersBySwapping(int[] nums) {
    for (int i = 0; i < nums.length; ) {
      int num = nums[i];
      if (!(num == i + 1 || num == nums[num - 1])) {
        nums[i] = nums[num - 1];
        nums[num - 1] = num;
      } else {
        i++;
      }
    }
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        result.add(i + 1);
      }
    }
    return result;
  }

  public List<Integer> findDisappearedNumbersUsingCountArray(int[] nums) {
    ArrayList<Integer> result = new ArrayList<>();
    int[] count = new int[nums.length + 1];
    for (int i : nums) {
      count[i]++;
    }
    for (int i = 1; i < nums.length; i++) {
      if (count[i] == 0) {
        result.add(i);
      }
    }
    return result;
  }

  public List<Integer> findDisappearedNumbers(int[] nums) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      int val = Math.abs(nums[i]) - 1;
      if (nums[val] > 0) {
        nums[val] = -nums[val];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        result.add(i + 1);
      }
    }
    return result;
  }
}
