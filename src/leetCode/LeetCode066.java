/**
 * Created by Sarveswara Tippireddy on Aug 31, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/plus-one/description/
 * 
 */
package leetCode;

public class LeetCode066 {
  public int[] plusOne(int[] digits) {
    int carry = 1;
    for (int i = digits.length - 1; i >= 0; i--) {
      int result = carry + digits[i];
      if (result > 9) {
        carry = 1;
        digits[i] = result % 10;
      } else {
        carry = 0;
        digits[i] = result;
      }
    }
    if (carry > 0) {
      int[] result = new int[digits.length + 1];
      result[0] = carry;
      for (int i = 1; i < result.length; i++) {
        result[i] = digits[i - 1];
      }
      return result;
    }
    return digits;
  }

  // The following solution is taken from
  // https://discuss.leetcode.com/topic/24288/my-simple-java-solution
  public int[] plusOneEfficient(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      } else {
        digits[i] = 0;
      }
    }
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
  }
}
