/**
 * Created by Sarveswara Tippireddy on Aug 31, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/number-of-1-bits/description/
 * 
 * Sources for the ideas used in the solutions: 
 * https://leetcode.com/articles/number-1-bits/
 * https://discuss.leetcode.com/topic/11385/simple-java-solution-bit-shifting. 
 * Do read them for better understanding.
 */
package leetCode;

public class LeetCode191 {
  // The question requires n to be treated as an unsigned integer
  public int hammingWeightUsingUnsignedShift(int n) {
    int count = 0;
    // Note the use of n!=0 and not n>0. Why?
    while (n != 0) {
      count += (n & 1);
      // Note this use of unsigned bit shift. Why?
      n = n >>> 1;
    }
    return count;
  }

  public int hammingWeightUsingShiftingMask(int n) {
    int count = 0;
    // Note the use of n!=0 and not n>0. Why?
    int mask = 1;
    for (int i = 0; i < 32; i++) {
      count += (n & mask) == 0 ? 0 : 1;
      mask = mask << 1;
    }
    return count;
  }

  public int hammingWeightByCountingLSB(int n) {
    int count = 0;
    // Note the use of n!=0 and not n>0. Why?
    while (n != 0) {
      count++;
      n &= (n - 1);
    }
    return count;
  }
}
