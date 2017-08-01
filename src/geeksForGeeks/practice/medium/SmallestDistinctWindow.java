/**
 * Created by Sarveswara Tippireddy on Aug 01, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/smallest-distant-window/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/smallest-window-contains-characters-string/
 */
package geeksForGeeks.practice.medium;

import java.util.HashSet;
import java.util.Scanner;

public class SmallestDistinctWindow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      String s = sc.next();
      System.out.println(getSmallestWindow(s));
    }
    sc.close();
  }

  private static int getSmallestWindow(String s) {
    HashSet<Character> set = new HashSet<>();
    int[] hash = new int[26];
    for (char c : s.toCharArray()) {
      set.add(c);
    }
    int i = 0;
    int j = 0;
    int count = 0;
    int minLength = s.length();
    while (i < s.length() && j < s.length()) {
      while (i < s.length()) {
        if (hash[s.charAt(i) - 'a'] == 0) {
          count++;
        }
        hash[s.charAt(i) - 'a']++;
        i++;
        if (count == set.size()) {
          break;
        }
      }
      for (; j < s.length() && count == set.size(); j++) {
        hash[s.charAt(j) - 'a']--;
        if (hash[s.charAt(j) - 'a'] == 0) {
          count--;
          minLength = Integer.min(minLength, i - j);
          j++;
          break;
        }
      }
    }
    return minLength;
  }
}
