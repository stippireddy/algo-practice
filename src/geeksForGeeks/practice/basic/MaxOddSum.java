/**
 * Created by Sarveswara Tippireddy on Jul 20, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/max-odd-sum/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/subsequence-maximum-odd-sum/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class MaxOddSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(findMaxOddSum(input));
    }
    sc.close();
  }

  public static int findMaxOddSum(int[] input) {
    int minOdd = Integer.MAX_VALUE;
    int sum = 0;
    for (int i = 0; i < input.length; i++) {
      if ((input[i] & 1) != 0) {
        minOdd = Integer.min(minOdd, Math.abs(input[i]));
      }
      if (input[i] > 0) {
        sum += input[i];
      }
    }
    if ((sum & 1) == 0) {
      if (minOdd == Integer.MAX_VALUE) {
        return -1;
      }
      return sum - minOdd;
    }
    return sum;
  }
}
