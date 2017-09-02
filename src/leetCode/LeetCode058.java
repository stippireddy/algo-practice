/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/length-of-last-word/description/
 * 
 */
package leetCode;

public class LeetCode058 {
  public int lengthOfLastWord(String s) {
    if (s.length() == 0) {
      return 0;
    }
    int i = s.length() - 1;
    while (i >= 0) {
      if (s.charAt(i) == ' ') {
        i--;
      } else {
        break;
      }
    }
    if (i < 0) {
      return 0;
    }
    int endingIndex = i;
    int startingIndex = i;
    while (i >= 0) {
      if (s.charAt(i) != ' ') {
        startingIndex = i;
        i--;
      }else {
        break;
      }
    }
    return endingIndex - startingIndex + 1;
  }
}
