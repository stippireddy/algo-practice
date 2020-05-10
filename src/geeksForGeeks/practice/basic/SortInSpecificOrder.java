/**
 * Created by Sarveswara Tippireddy on Jul 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/sort-in-specific-order/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/sort-even-numbers-ascending-order-sort-odd-numbers-descending-order/
 */
package geeksForGeeks.practice.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortInSpecificOrder {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      Integer[] a = new Integer[k];
      for (int i = 0; i < k; i++) {
        a[i] = sc.nextInt();
      }
      sortByUsingNegNumbers(a);
      StringBuffer sb = new StringBuffer();
      for (int i : a) {
        sb.append(i).append(" ");
      }
      System.out.println(sb.substring(0, sb.length() - 1));
    }
    sc.close();
  }

  public static void sortByPartition(Integer[] a) {
    int odd = 0, even = a.length - 1;
    while (odd < even) {
      while (odd < a.length && (a[odd] & 1) != 0) {
        odd++;
      }
      while (even >= 0 && (a[even] & 1) == 0) {
        even--;
      }
      if (odd < even) {
        int temp = a[odd];
        a[odd] = a[even];
        a[even] = temp;
      }
    }
    Arrays.sort(
        a,
        0,
        odd,
        new Comparator<Integer>() {

          @Override
          public int compare(Integer o1, Integer o2) {
            return o2 - o1;
          }
        });
    Arrays.sort(a, odd, a.length);
  }

  public static void sortByUsingNegNumbers(Integer[] a) {
    for (int i = 0; i < a.length; i++) {
      if ((a[i] & 1) != 0) {
        a[i] *= -1;
      }
    }
    Arrays.sort(a);
    for (int i = 0; i < a.length; i++) {
      if ((a[i] & 1) != 0) {
        a[i] *= -1;
      }
    }
  }
}

