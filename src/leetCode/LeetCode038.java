/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/count-and-say/description/
 */
package leetCode;

public class LeetCode038 {

  public String countAndSay(int n) {
    String s = "1";
    StringBuffer sb = new StringBuffer();
    while (n-- > 1) {
      int i = 0;
      while (i < s.length()) {
        int count = 0;
        char curr = s.charAt(i);
        while (i < s.length() && s.charAt(i) == curr) {
          i++;
          count++;
        }
        sb.append(count).append(curr);
      }
      s = sb.toString();
      sb.delete(0, sb.length());
    }
    return s;
  }
}