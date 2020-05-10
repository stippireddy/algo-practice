/**
 * Created by Sarveswara Tippireddy on Jul 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/elements-in-the-range/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/check-if-an-array-contains-all-elements-of-a-given-range/
 */
package geeksForGeeks.practice.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ElementsInRange {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(areElementsInRangeModifyInput(input, a, b));
    }
    sc.close();
  }

  public static String areElementsInRangeUsingHashing(int[] input, int a, int b) {
    int[] hash = new int[1001];
    for (int i : input) {
      hash[i] = 1;
    }
    for (int i = a; i <= b; i++) {
      if (hash[i] == 0) {
        return "No";
      }
    }
    return "Yes";
  }

  public static String areElementsInRangeUsingSorting(int[] input, int a, int b) {
    Arrays.sort(input);
    int i = binarySearch(input, a);
    if (i < 0) {
      return "No";
    }
    int k = a;
    while (i < input.length && k <= b) {
      if (k == input[i]) {
        k++;
        i++;
      } else if (input[i] < k) {
        i++;
      } else {
        return "No";
      }
    }
    return "Yes";
  }

  private static int binarySearch(int[] a, int key) {
    int low = 0, high = a.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (a[mid] == key) {
        return mid;
      } else if (a[mid] < key) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return 0;
  }

  public static String areElementsInRangeModifyInput(int[] input, int a, int b) {
    for (int j = 0; j < input.length; j++) {
      int currNum = Math.abs(input[j]);
      if (currNum >= a && currNum <= b) {
        if (currNum - a < input.length) {
          input[currNum - a] *= -1;
        } else {
          return "No";
        }
      }
    }
    for (int i = 0; i < b - a; i++) {
      if (input[i] > 0) {
        return "No";
      }
    }
    return "Yes";
  }
}
