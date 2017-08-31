/**
 * Created by Sarveswara Tippireddy on Aug 31, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/number-of-1-bits/description/
 * 
 * This solution copies the idea from this source
 * (https://discuss.leetcode.com/topic/11385/simple-java-solution-bit-shifting). Do read it for
 * better understanding.
 */
package leetCode;

public class LeetCode191 {
  // The question requires n to be treated as an unsigned integer
  public int hammingWeight(int n) {
    int count = 0;
    // Note the use of n!=0 and not n>0. Why?
    while (n != 0) {
      count += (n & 1);
      // Note this use of unsigned bit shift. Why?
      n = n >>> 1;
    }
    return count;
  }
}
