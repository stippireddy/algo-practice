package leetCode;

import java.util.Arrays;

/**
 * Created by Sarveswara Tippireddy on 5/17/2017.
 */
public class LeetCode561 {

  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int maxSum = 0;
    for (int i = 0; i < nums.length; i = i + 2) {
      maxSum = maxSum + nums[i];
    }
    return maxSum;
  }

  public int arrayPairsSumEfficient(int[] nums) {
    int[] hash = new int[20001];
    boolean flag = true;
    for (int i : nums) {
      hash[i + 10000]++;
    }
    int sum = 0;
    for (int i = 0; i < hash.length; ) {
      if (hash[i] > 0 && flag == true) {
        sum = sum + i - 10000;
        flag = false;
        hash[i]--;
      } else if (hash[i] > 0 && flag == false) {
        flag = true;
        hash[i]--;
      } else {
        i++;
      }
    }
    return sum;
  }
}
