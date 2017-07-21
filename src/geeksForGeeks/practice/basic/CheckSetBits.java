/**
 * Created by Sarveswara Tippireddy on Jul 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/check-set-bits/0
 *
 * <p>The solution editorials can be found @ http://www.geeksforgeeks.org/check-bits-number-set/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class CheckSetBits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      if ((k + 1 & k) == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}

