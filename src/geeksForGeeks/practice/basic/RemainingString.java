/**
 * Created by Sarveswara Tippireddy on Jul 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/remaining-string/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/print-string-specified-character-occurred-given-no-times/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class RemainingString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      String input = sc.next();
      String c = sc.next();
      int frequency = sc.nextInt();
      System.out.println(remainingString(input, c.charAt(0), frequency));
    }
    sc.close();
  }

  private static String remainingString(String input, char key, int frequency) {
    if (frequency == 0) {
      return input;
    }
    int count = 0;
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == key) {
        count++;
        if (count == frequency) {
          if (i == input.length() - 1) {
            return "Empty string";
          }
          return input.substring(i + 1, input.length());
        }
      }
    }
    return "Empty string";
  }
}
