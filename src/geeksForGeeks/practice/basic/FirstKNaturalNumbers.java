/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/first-k-natural-numbers/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/find-first-k-natural-numbers-missing-given-array/
 */
package geeksForGeeks.practice.basic;

import java.util.Arrays;
import java.util.Scanner;

public class FirstKNaturalNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int count = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(printString(getFirstKNaturalNumbers(input, count)));
    }
    sc.close();
  }

  private static Integer[] getFirstKNaturalNumbers(int[] input, int count) {
    Arrays.sort(input);
    Integer[] result = new Integer[count];
    int i = 0;
    int num = 1;
    for (int k : input) {
      if (k > 0) {
        while (i < count && num < k) {
          result[i] = num;
          i++;
          num++;
        }
        num = k + 1;
      }
    }
    while (i < count) {
      result[i++] = num++;
    }
    return result;
  }

  private static <T> String printString(T[] input) {
    StringBuffer sb = new StringBuffer();
    for (T i : input) {
      sb.append(i).append(" ");
    }
    return sb.substring(0, sb.length() - 1);
  }
}
