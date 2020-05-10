/**
 * Created by Sarveswara Tippireddy on Jul 17, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * https://www.hackerrank.com/challenges/string-reduction
 */
package hackerrank.dynamicProgramming;

import java.util.Scanner;

public class StringReduction {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      String input = sc.next();
      System.out.println(reducedStringLength(input));
    }
    sc.close();
  }

  public static int reducedStringLength(String input) {
    //TODO complete this
    return 0;
  }
}
