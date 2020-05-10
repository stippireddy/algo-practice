/**
 * Created by Sarveswara Tippireddy on Jul 22, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/check-whether-k-th-bit-set-not/
 */
package geeksForGeeks.practice.medium;

import java.util.Scanner;

public class CheckWhetherKBitSet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfTestCases = sc.nextInt();
    while (numberOfTestCases-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      if ((n & 1 << k) == 0) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    }
    sc.close();
  }
}
