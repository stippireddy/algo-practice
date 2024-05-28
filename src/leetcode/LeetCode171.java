/**
 * Created by Sarveswara Tippireddy on Aug 30, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/excel-sheet-column-number/description/
 */
package leetcode;

public class LeetCode171 {

  public int titleToNumber(String s) {
    int result = 0;
    int mul = 1;
    for (int i = s.length() - 1; i >= 0; i--) {
      result += (s.charAt(i) - 'A' + 1) * mul;
      mul *= 26;
    }
    return result;
  }
}
