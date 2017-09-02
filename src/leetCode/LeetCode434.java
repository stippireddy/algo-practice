/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/number-of-segments-in-a-string/description/
 * 
 */
package leetCode;

public class LeetCode434 {
  public int countSegments(String s) {
    if (s.length() == 0) {
      return 0;
    }
    int i = 0;
    int count = s.charAt(i) == ' ' ? -1 : 0;
    while (i < s.length()) {
      while (i < s.length() && s.charAt(i) != ' ') {
        i++;
      }
      while (i < s.length() && s.charAt(i) == ' ') {
        i++;
      }
      count++;
    }
    return count;
  }
}
