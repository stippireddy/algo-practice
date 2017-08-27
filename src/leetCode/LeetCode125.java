/**
 * Created by Sarveswara Tippireddy on Aug 27, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/valid-palindrome/description/
 */
package leetCode;

public class LeetCode125 {
  public boolean isPalindrome(String s) {
    int i = 0, j = s.length() - 1;
    while (i < j) {
      char currI = s.charAt(i);
      if (!Character.isLetterOrDigit(currI)) {
        i++;
        continue;
      }
      char currJ = s.charAt(j);
      if (!Character.isLetterOrDigit(currJ)) {
        j--;
        continue;
      }
      if (Character.toLowerCase(currI) == Character.toLowerCase(currJ)) {
        i++;
        j--;
      } else {
        return false;
      }
    }
    return true;
  }
}
