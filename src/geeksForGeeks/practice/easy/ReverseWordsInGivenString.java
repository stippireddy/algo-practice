/**
 * Created by Sarveswara Tippireddy on Oct 09, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/reverse-words-in-a-given-string/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class ReverseWordsInGivenString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      System.out.println(checkParanthesis(sc.next()));
    }
    sc.close();
  }

  public static String checkParanthesis(String s) {
    StringBuffer sb = new StringBuffer(s);
    sb.reverse();
    int startIndex = 0;
    int endIndex = 0;
    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == '.') {
        endIndex = i - 1;
        reverse(sb, startIndex, endIndex);
        startIndex = i + 1;
        endIndex = i + 1;
      }
    }
    reverse(sb, startIndex, sb.length() - 1);
    return sb.toString();
  }

  private static void reverse(StringBuffer sb, int startIndex, int endIndex) {
    while (startIndex >= 0 && endIndex < sb.length()
        && startIndex < endIndex) {
      char temp = sb.charAt(startIndex);
      sb.setCharAt(startIndex, sb.charAt(endIndex));
      sb.setCharAt(endIndex, temp);
      startIndex++;
      endIndex--;
    }
  }
}
