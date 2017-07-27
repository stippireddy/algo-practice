/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/fibonacci-in-the-array/0
 *
 * <p>The solution editorial can be found @ http://www.geeksforgeeks.org/fibonacci-number-array/
 */
package geeksForGeeks.practice.basic;

import java.util.HashSet;
import java.util.Scanner;

public class FibonacciInArray {
  private static HashSet<Integer> set = new HashSet<>();

  static {
    set.add(0);
    set.add(1);
    set.add(2);
    int i = 1;
    int j = 2;
    while (j < 10000) {
      int next = i + j;
      i = j;
      j = next;
      set.add(next);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int k = sc.nextInt();
      int count = 0;
      for (int i = 0; i < k; i++) {
        if (set.contains(sc.nextInt())) {
          count++;
        }
      }
      System.out.println(count);
    }
    sc.close();
  }
}
