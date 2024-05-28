/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/palindromic-substrings/description/
 */
package leetcode;

public class LeetCode647 {

  public int countSubstringsBruteForce(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        if (isPalindrome(s, i, j)) {
          count++;
        }
      }
    }
    return count;
  }

  private boolean isPalindrome(String s, int i, int j) {
    if (i == j) {
      return true;
    }
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      } else {
        i++;
        j--;
      }
    }
    return true;
  }

  public int countSubstringsEfficient(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      int left = i;
      int right = i;
      while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
        count++;
      }
      left = i - 1;
      right = i;
      while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
        count++;
      }
    }
    return count;
  }
}
