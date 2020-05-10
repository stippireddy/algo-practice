/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/frequency-of-array-elements/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/count-frequencies-elements-array-o1-extra-space-time/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class FrequencyOfArrayElements {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(printString(countFrequencyWithoutExtraSpace(input)));
    }
    sc.close();
  }

  public static int[] countFrequencyUsingHash(int[] a) {
    int[] hash = new int[a.length];
    for (int i : a) {
      hash[i - 1]++;
    }
    return hash;
  }

  public static int[] countFrequencyWithoutExtraSpace(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] - 1;
    }
    for (int i = 0; i < a.length; i++) {
      a[a[i] % a.length] += a.length;
    }
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] / a.length;
    }
    return a;
  }

  private static String printString(int[] input) {
    StringBuffer sb = new StringBuffer();
    for (int i : input) {
      sb.append(i).append(" ");
    }
    return sb.substring(0, sb.length() - 1);
  }
}
