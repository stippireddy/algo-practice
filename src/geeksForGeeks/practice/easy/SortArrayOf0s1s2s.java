/**
 * Created by Sarveswara Tippireddy on Jul 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class SortArrayOf0s1s2s {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      sort(input);
      StringBuffer sb = new StringBuffer();
      for (int i : input) {
        sb.append(i).append(" ");
      }
      System.out.println(sb.substring(0, sb.length() - 1));
    }
    sc.close();
  }

  private static void sort(int[] input) {
    int low = 0, mid = 0, high = input.length - 1;
    while (mid <= high) {
      if (input[mid] == 0) {
        swap(input, low, mid);
        low++;
        mid++;
      } else if (input[mid] == 2) {
        swap(input, mid, high);
        high--;
      } else {
        mid++;
      }

    }
  }

  private static void swap(int[] input, int a, int b) {
    int temp = input[a];
    input[a] = input[b];
    input[b] = temp;
  }
}
