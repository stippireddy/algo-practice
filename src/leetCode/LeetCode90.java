package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode90 {

  public static void main(String[] args) {
    LeetCode90 l = new LeetCode90();
    System.out.println(l.subsetsWithDup(new int[]{1, 1, 2, 2, 2}));
  }

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>());
    for (int i = 0; i < nums.length; i++) {
      List<Integer> subResult = new ArrayList<>();
      int j = i;
      while (j != 0 && j < nums.length && nums[j - 1] == nums[j]) {
        subResult.add(nums[j]);
        j++;
      }
      while (j < nums.length) {
        subResult.add(nums[j]);
        result.add(new ArrayList<>(subResult));
        j++;
      }
    }
    return result;
  }
}
