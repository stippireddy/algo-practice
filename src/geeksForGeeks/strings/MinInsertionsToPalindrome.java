/**
 * Created by Sarveswara Tippireddy on Jul 12, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/minimum-insertions-to-form-a-palindrome-with-permutations-allowed/
 */
package geeksForGeeks.strings;

import java.util.Scanner;

public class MinInsertionsToPalindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      System.out.println(getMinInsertions(sc.next()));
    }
    sc.close();
  }

  private static int getMinInsertions(String next) {
    int[] count = new int[26];
    for (char c : next.toCharArray()) {
      count[c - 'a']++;
    }
    int oddCount = 0;
    for (int i : count) {
      if ((i & 1) != 0) {
        oddCount++;
      }
    }
    return oddCount > 0 ? oddCount - 1 : 0;
  }
}
