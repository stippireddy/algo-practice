/**
 * Created by Sarveswara Tippireddy on Aug 2, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/pair-array-product-sum/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/number-pairs-array-product-greater-sum/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class PairArrayProductSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int[] input = new int[n];
      for (int i = 0; i < n; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(findNumberOfPairs(input));
    }
    sc.close();
  }

  private static int findNumberOfPairs(int[] a) {
    int numberOfTwos = 0;
    int numberOfGreaterThanTwos = 0;
    for (int i : a) {
      if (i == 2) {
        numberOfTwos++;
      } else if (i > 2) {
        numberOfGreaterThanTwos++;
      }
    }
    return (numberOfTwos * numberOfGreaterThanTwos)
        + (numberOfGreaterThanTwos * (numberOfGreaterThanTwos - 1)) / 2;
  }
}
