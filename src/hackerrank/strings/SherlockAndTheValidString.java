/**
 * Created by Sarveswara Tippireddy on Jul 11, 2017
 *
 * <p>This HackerRank problem can be found @
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string
 */
package hackerrank.strings;

public class SherlockAndTheValidString {

  public static String isValid(String s) {
    int[] count = new int[26];
    for (char c : s.toCharArray()) {
      count[c - 'a']++;
    }
    int min = s.length();
    int max = 0;
    int totalCharCount = 0;
    for (int i : count) {
      if (i != 0) {
        min = Integer.min(min, i);
        max = Integer.max(max, i);
        totalCharCount++;
      }
    }
    if (min == max) {
      return "YES";
    }
    int minCount = 0;
    int maxCount = 0;
    for (int i : count) {
      if (i == min) {
        minCount++;
      } else if (i == max) {
        maxCount++;
      }
    }
    if (totalCharCount != (minCount + maxCount)) {
      return "NO";
    }
    if (min == 1 && minCount == 1) {
      return "YES";
    }
    if (maxCount == 1 && max - min == 1) {
      return "YES";
    }
    return "NO";
  }
}
