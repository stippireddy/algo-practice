/**
 * Created by Sarveswara Tippireddy on Aug 30, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/power-of-three/description/
 */
package leetcode;

public class LeetCode326 {

  // Find the maximum possible power of 3 within the range of java integer.
  // If the max is perfectly divisible by the given n, then n is a power of 3.
  public boolean isPowerOfThree(int n) {
    if (n < 1) {
      return false;
    }
    int maxPowerOf3 =
        (int) Math.pow(3, (int) (Math.log10((double) Integer.MAX_VALUE) / Math.log10(3)));
    return maxPowerOf3 % n == 0;
  }
}
