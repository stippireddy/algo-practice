/**
 * Created by Sarveswara Tippireddy on Jul 12, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/print-string-ignoring-alternate-occurrences-character/
 */
package geeksForGeeks.strings;

import java.util.Scanner;

public class PrintIgnoringAlternateOccurances {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    while (n-- > 0) {
      print(sc.nextLine());
    }
    sc.close();
  }

  private static void print(String s) {
    int[] count = new int[127];
    StringBuffer sb = new StringBuffer();
    for (char c : s.toCharArray()) {
      char temp = Character.toLowerCase(c);
      if (count[temp] == 0) {
        sb.append(c);
        count[temp] = 1;
      } else {
        count[temp] = 0;
      }
    }
    System.out.println(sb.toString());
  }
}
