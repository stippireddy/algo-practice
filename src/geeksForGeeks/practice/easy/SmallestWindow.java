/**
 * Created by Sarveswara Tippireddy on Aug 2, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
 */
package geeksForGeeks.practice.easy;

import java.util.HashMap;
import java.util.Scanner;

public class SmallestWindow {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      String s = sc.next();
      String t = sc.next();
      System.out.println(getSmallestWindow(s, t));
    }
    sc.close();
  }

  private static String getSmallestWindow(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : t.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    int[] hash = new int[26];
    int count = 0;
    int right = 0;
    int left = 0;
    int minLength = s.length();
    int[] result = new int[2];
    while (right < s.length() && left < s.length()) {
      while (right < s.length()) {
        if (map.containsKey(s.charAt(right))) {
          if (hash[s.charAt(right) - 'a'] < map.get(s.charAt(right))) {
            count++;
          }
          hash[s.charAt(right) - 'a']++;
        }
        right++;
        if (count == t.length()) {
          break;
        }
      }
      if (count < t.length() && right == s.length() && left == 0) {
        return "-1";
      }
      while (left < s.length() && count == t.length()) {
        char charAtJ = s.charAt(left);
        if (map.containsKey(charAtJ)) {
          if ((right - left) < minLength) {
            minLength = right - left;
            result[0] = left;
            result[1] = right;
          }
          hash[charAtJ - 'a']--;
          if (hash[charAtJ - 'a'] < map.get(charAtJ)) {
            count--;
            left++;
            break;
          }
        }
        left++;
      }
    }
    return s.substring(result[0], result[1]);
  }
}
