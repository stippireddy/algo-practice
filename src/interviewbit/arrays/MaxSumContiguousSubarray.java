/**
 * Created by Sarveswara Tippireddy on Jul 2, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
 */
package interviewbit.arrays;

import java.util.List;

public class MaxSumContiguousSubarray {
  public int maxSubArray(final List<Integer> a) {
    int minNegative = Integer.max(Integer.MIN_VALUE, a.get(0));
    int maxSum = a.get(0);
    int sum = a.get(0);
    for (int i = 1; i < a.size(); i++) {
      if (sum + a.get(i) > a.get(i)) {
        sum = sum + a.get(i);
      } else {
        sum = a.get(i);
      }
      maxSum = Integer.max(maxSum, sum);
      minNegative = Integer.max(minNegative, a.get(i));
    }
    if (sum < 0) {
      return minNegative;
    } else {
      return maxSum;
    }
  }
}
