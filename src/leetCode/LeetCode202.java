/**
 * Created by Sarveswara Tippireddy on Aug 25, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/happy-number/description/
 */
package leetCode;

public class LeetCode202 {

  public boolean isHappy(int n) {
    int singleJump = n;
    int doubleJump = n;
    while (true) {
      singleJump = calculateSumOfDigits(singleJump);
      if (singleJump == 1) {
        return true;
      }
      doubleJump = calculateSumOfDigits(doubleJump);
      if (doubleJump == 1) {
        return true;
      }
      doubleJump = calculateSumOfDigits(doubleJump);
      if (singleJump == doubleJump) {
        return false;
      }
    }
  }

  private int calculateSumOfDigits(int i) {
    int result = 0;
    while (i > 0) {
      int unitsDigit = i % 10;
      result += unitsDigit * unitsDigit;
      i /= 10;
    }
    return result;
  }
}
