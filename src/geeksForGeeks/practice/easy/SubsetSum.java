/**
 * Created by Sarveswara Tippireddy on Jul 25, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/perfect-sum-problem/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/perfect-sum-problem-print-subsets-given-sum/
 * http://www.geeksforgeeks.org/dynamic-programming-set-18-partition-problem/
 */
package geeksForGeeks.practice.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubsetSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      if (isPartitionable(input)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }

  public static boolean isPartitionable(int[] input) {
    int sum = 0;
    for (int i = 0; i < input.length; i++) {
      sum += input[i];
    }
    if ((sum & 1) != 0) {
      return false;
    }
    sum = sum / 2;
    boolean[][] dp = new boolean[sum + 1][input.length + 1];
    Arrays.fill(dp[0], true);
    for (int i = 1; i < sum + 1; i++) {
      for (int j = 1; j < input.length + 1; j++) {
        boolean b = (i - input[j - 1]) >= 0 ? dp[i - input[j - 1]][j - 1] : false;
        boolean a = dp[i][j - 1];
        dp[i][j] = a || b;
      }
    }
    // One of the subsets will be stored in the result
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = sum, j = input.length; i > 0 && j > 0; ) {
      if (!dp[i][j - 1]) {
        result.add(input[j - 1]);
        i = i - input[j - 1];
      }
      j--;
    }
    System.out.println(result);
    return dp[sum][input.length];
  }
}
