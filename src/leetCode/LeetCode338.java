/**
 * Created by Sarveswara Tippireddy on Sep 1, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/counting-bits/description/
 * 
 */
package leetCode;

public class LeetCode338 {
  public int[] countBits(int num) {
    int[] result = new int[num + 1];
    for (int i = 1; i <= num; i++) {
      result[i] = 1 + result[i & i - 1];
    }
    return result;
  }
}
