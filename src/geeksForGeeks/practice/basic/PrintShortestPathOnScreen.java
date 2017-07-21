/**
 * Created by Sarveswara Tippireddy on Jul 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/primitive-typing/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/print-shortest-path-print-string-screen/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class PrintShortestPathOnScreen {
  char[][] input =
      new char[][] {
        {'A', 'B', 'C', 'D', 'E'},
        {'F', 'G', 'H', 'I', 'J'},
        {'K', 'L', 'M', 'N', 'O'},
        {'P', 'Q', 'R', 'S', 'T'},
        {'U', 'V', 'W', 'X', 'Y'},
        {'Z'}
      };
  public static int printPath(String s) {
    int currRow = 0;
    int currCol = 0;
    int totalPathDistance = 0;
    for (char c : s.toCharArray()) {
      int destRow = (c - 'A') / 5;
      int destCol = (c - 'A') % 5;
      totalPathDistance += Math.abs(destCol - currCol);
      totalPathDistance += Math.abs(destRow - currRow);
      totalPathDistance++;
      currRow = destRow;
      currCol = destCol;
    }
    return totalPathDistance;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      System.out.println(printPath(sc.next()));
    }
    sc.close();
  }
}
