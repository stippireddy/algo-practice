/**
 * Created by Sarveswara Tippireddy on Jul 22, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/excel-sheet/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/find-excel-column-name-given-number/
 */
package geeksForGeeks.practice.medium;

import java.util.Scanner;

public class ExcelSheetPart1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfTestCases = sc.nextInt();
    while (numberOfTestCases-- > 0) {
      int n = sc.nextInt();
      System.out.println(getColumnName(n));
    }
    sc.close();
  }

  public static String getColumnName(int n) {
    StringBuffer sb = new StringBuffer();
    while (n > 0) {
      if ((n % 26) == 0) {
        sb.append('Z');
        n = (n / 26) - 1;
      } else {
        sb.append((char) ('A' + (n % 26) - 1));
        n /= 26;
      }
    }
    return sb.reverse().toString();
  }
}
