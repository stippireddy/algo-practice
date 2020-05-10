/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/palindromic-substrings/description/
 */
package leetCode;

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
      int left = i - 1, right = i + 1;
      count++;
      while (left >= 0 && right < s.length()) {
        if (s.charAt(left) == s.charAt(right)) {
          left--;
          right++;
          count++;
        } else {
          break;
        }
      }
    }
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        int left = i - 2, right = i + 1;
        count++;
        while (left >= 0 && right < s.length()) {
          if (s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
          } else {
            break;
          }
        }
      }
    }
    return count;
  }
}
