/**
 * Created by Sarveswara Tippireddy on Jul 14, 2017
 *
 * <p>This HackerRank problem can be found @ https://www.hackerrank.com/challenges/encryption
 */
package hackerrank.implementation;

import java.util.Scanner;

public class Encryption {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    int l = input.length();
    int rows = (int) Math.sqrt(l);
    int columns = rows * rows >= l ? rows : rows + 1;
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < columns; i++) {
      int j = i;
      while (j < l) {
        sb.append(input.charAt(j));
        j += columns;
      }
      sb.append(" ");
    }
    sb.deleteCharAt(sb.length() - 1);
    System.out.println(sb.toString());
    sc.close();
  }
}
