/**
 * Created by Sarveswara Tippireddy on Jul 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/in-first-but-second/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/find-elements-present-first-array-not-second/
 */
package geeksForGeeks.practice.basic;

import java.util.HashSet;
import java.util.Scanner;

public class InFirstNotSecond {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int l = sc.nextInt();
      int[] input1 = new int[k];
      int[] input2 = new int[l];
      for (int i = 0; i < k; i++) {
        input1[i] = sc.nextInt();
      }
      for (int i = 0; i < l; i++) {
        input2[i] = sc.nextInt();
      }
      getInFirstNotSecond(input1, input2);
    }
    sc.close();
  }

  private static void getInFirstNotSecond(int[] input1, int[] input2) {
    HashSet<Integer> res = new HashSet<>();
    for (int i : input2) {
      res.add(i);
    }
    StringBuffer sb = new StringBuffer();
    for (int i : input1) {
      if (!res.contains(i)) {
        sb.append(i).append(" ");
      }
    }
    System.out.println(sb.substring(0, sb.length() - 1));
  }
}