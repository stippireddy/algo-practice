/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * practice.geeksforgeeks.org/problems/count-the-elements/0
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class CountTheElements {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input1 = new int[k];
      int[] input2 = new int[k];
      for (int i = 0; i < k; i++) {
        input1[i] = sc.nextInt();
      }
      for (int i = 0; i < k; i++) {
        input2[i] = sc.nextInt();
      }
      System.out.println(printString(getCount(input1, input2)));
    }
    sc.close();
  }

  private static int[] getCount(int[] a, int[] b) {
    int min = a[0], max = a[0];
    for (int i : a) {
      max = Integer.max(max, i);
      min = Integer.min(min, i);
    }
    int[] hash = new int[max - min + 1];
    for (int i : b) {
      if (i <= max && i >= min) {
        hash[i - min]++;
      } else if (i < min) {
        hash[0]++;
      }
    }
    for (int i = 1; i < hash.length; i++) {
      hash[i] = hash[i] + hash[i - 1];
    }
    int[] res = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      res[i] = hash[a[i] - min];
    }
    return res;
  }

  private static String printString(int[] input) {
    StringBuffer sb = new StringBuffer();
    for (int i : input) {
      sb.append(i).append(',');
    }
    return sb.substring(0, sb.length() - 1);
  }
}
