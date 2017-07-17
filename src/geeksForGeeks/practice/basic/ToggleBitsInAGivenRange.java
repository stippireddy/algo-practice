/**
 * Created by Sarveswara Tippireddy on Jul 15, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/stable-sort-and-position/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/position-element-stable-sort/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class ToggleBitsInAGivenRange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int left = sc.nextInt();
      int right = sc.nextInt();
      System.out.println(toggle1(k, left, right));
    }
    sc.close();
  }

  private static int toggle1(int k, int left, int right) {
    int toggler = 1 << left - 1;
    for (int i = left; i <= right; i++) {
      k ^= toggler;
      toggler = toggler << 1;
    }
    return k;
  }
  private static int toggle2(int k, int left, int right) {
    int toggler = ((1 << right) - 1) ^ ((1 << (left - 1)) - 1);
    return k ^ toggler;
  }
}
