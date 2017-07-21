/**
 * Created by Sarveswara Tippireddy on Jul 20, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/bitonic-generator-sort/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/sort-even-placed-elements-increasing-odd-placed-decreasing-order/
 */
package geeksForGeeks.practice.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BitonicGeneratorSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      Integer[] input = new Integer[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      bitonicSort(input);
      StringBuffer sb = new StringBuffer();
      for (int i : input) {
        sb.append(i).append(" ");
      }
      System.out.println(sb.substring(0, sb.length() - 1));
    }
    sc.close();
  }

  public static void bitonicSort(Integer[] input) {
    int mid = (input.length - 1) / 2;
    int odd = 1;
    int even = (mid & 1) == 0 ? mid + 2 : mid + 1;
    while (odd < input.length && even < input.length) {
      int temp = input[odd];
      input[odd] = input[even];
      input[even] = temp;
      odd += 2;
      even += 2;
    }
    Arrays.sort(input, 0, mid + 1);
    Arrays.sort(
        input,
        mid + 1,
        input.length,
        new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
            return o2 - o1;
          }
        });
  }
}
