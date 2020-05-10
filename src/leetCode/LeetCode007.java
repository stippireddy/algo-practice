/**
 * Created by Sarveswara Tippireddy on Aug 31, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/reverse-integer/description/
 */
package leetCode;

public class LeetCode007 {

  public int reverse(int n) {
    int result = 0;
    while (n != 0) {
      int tempResult = result * 10 + n % 10;
      if ((tempResult - (n % 10)) / 10 != result) {
        return 0;
      }
      result = tempResult;
      n /= 10;
    }
    return result;
  }

  public int reverse2(int n) {
    int result = 0;
    boolean isPostive = n > 0 ? true : false;
    n = Math.abs(n);
    while (n != 0) {
      if (result > Integer.MAX_VALUE / 10 || result > (Integer.MAX_VALUE - n % 10) / 10) {
        return 0;
      }
      result = result * 10 + n % 10;
      n /= 10;
    }
    return isPostive ? result : -1 * result;
  }
}
