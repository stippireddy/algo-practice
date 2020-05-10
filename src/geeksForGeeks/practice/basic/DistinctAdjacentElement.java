/**
 * Created by Sarveswara Tippireddy on Aug 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/distinct-adjacent-element/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/distinct-adjacent-elements-array/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class DistinctAdjacentElement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(isRearrangementPossible(input));
    }
    sc.close();
  }

  private static String isRearrangementPossible(int[] a) {
    int freq = 1;
    int num = a[0];
    for (int i = 1; i < a.length; i++) {
      if (freq == 0) {
        num = a[i];
      } else {
        if (a[i] == num) {
          freq++;
        } else {
          freq--;
        }
      }
    }
    freq = 0;
    for (int i : a) {
      if (num == i) {
        freq++;
      }
    }
    if (freq > (a.length + 1) / 2) {
      return "NO";
    }
    return "YES";
  }
}
