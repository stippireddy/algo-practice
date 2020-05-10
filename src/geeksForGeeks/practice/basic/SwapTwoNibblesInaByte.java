package geeksForGeeks.practice.basic;

/**
 * Created by Sarveswara Tippireddy on Oct 09, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/swap-two-nibbles-in-a-byte/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/count-number-of-bits-to-be-flipped-to-convert-a-to-b/
 */

import java.util.Scanner;

public class SwapTwoNibblesInaByte {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int temp = a & 0x0F;
      for (int i = 0; i < 4; i++) {
        a >>= 1;
        temp <<= 1;
      }
      System.out.println(temp | a);
    }
    sc.close();
  }
}
