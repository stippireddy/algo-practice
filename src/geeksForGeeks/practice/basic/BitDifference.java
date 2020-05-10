package geeksForGeeks.practice.basic;

/**
 * Created by Sarveswara Tippireddy on Oct 09, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/bit-difference/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/count-number-of-bits-to-be-flipped-to-convert-a-to-b/
 */

import java.util.Scanner;

public class BitDifference {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      a ^= b;
      int count = 0;
      while (a > 0) {
        a &= (a - 1);
        count++;
      }
      System.out.println(count);
    }
    sc.close();
  }
}
