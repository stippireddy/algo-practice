/**
 * Created by Sarveswara Tippireddy on Jul 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/sum-of-bit-differences/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/sum-of-bit-differences-among-all-pairs/
 */
package geeksForGeeks.practice.medium;

import java.util.Scanner;

public class SumOfBitDifferencesAmongAllPairs {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(calculate(input));
    }
    sc.close();
  }

  public static int calculate(int[] input) {
    int count = 0;
    for (int i = 0; i < 32; i++) {
      int n = 0;
      for (int j = 0; j < input.length; j++) {
        if ((input[j] & (1 << i)) == 0) {
          n++;
        }
      }
      count += (n * (input.length - n) * 2);
    }
    return count;
  }
}
