/**
 * Created by Sarveswara Tippireddy on Jul 23, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/excel-sheet-part-2/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/find-excel-column-number-column-title/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class ExcelSheetPart2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfTestCases = sc.nextInt();
    while (numberOfTestCases-- > 0) {
      System.out.println(getColumnNumber(sc.next()));
    }
    sc.close();
  }

  public static int getColumnNumber(String s) {
    int num = 0;
    int div = 1;
    for (int i = s.length() - 1; i >= 0; i--) {
      num += (s.charAt(i) - 'A' + 1) * div;
      div *= 26;
    }
    return num;
  }
}
