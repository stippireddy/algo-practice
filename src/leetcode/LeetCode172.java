/**
 * Created by Sarveswara Tippireddy on Aug 31, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/factorial-trailing-zeroes/description/
 */
package leetcode;

public class LeetCode172 {

  public int trailingZeroes(int n) {
    int temp = n;
    int count5 = 0;
    while (temp / 5 > 0) {
      count5 += (temp / 5);
      temp /= 5;
    }
    temp = n;
    int count2 = 0;
    while (temp / 2 > 0) {
      count2 += (temp / 2);
      temp /= 2;
    }
    return Integer.min(count5, count2);
  }
}
