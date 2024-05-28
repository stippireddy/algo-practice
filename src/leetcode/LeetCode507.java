/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/perfect-number/description/
 */
package leetcode;

public class LeetCode507 {

  public boolean checkPerfectNumber(int num) {
    if (num == 1) {
      return false;
    }
    int sum = 1;
    // The use of < Math.sqrt is because Perfect Squares can't be Perfect Numbers
    // Also note that negative number case is handled by Math.sqrt
    for (int i = 2; i < Math.sqrt(num); i++) {
      if ((num % i) == 0) {
        sum += i;
        sum += num / i;
      }
    }
    return sum == num;
  }
}
