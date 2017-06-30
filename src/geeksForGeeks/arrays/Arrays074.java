/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/find-the-row-with-maximum-number-1s/
 */
package geeksForGeeks.arrays;

import java.util.Scanner;

public class Arrays074 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Arrays074 a = new Arrays074();
    while (n-- > 0) {
      int rowLength = sc.nextInt();
      int colLength = sc.nextInt();
      int[][] input = new int[rowLength][colLength];
      for (int i = 0; i < rowLength; i++) {
        for (int j = 0; j < colLength; j++) {
          input[i][j] = sc.nextInt();
        }
      }
      System.out.println(a.getRowWithMaxOnesSmartLinearSearch(input));
    }
    sc.close();
  }

  public int getRowWithMaxOnesSmartLinearSearch(int[][] input) {
    int leastOneRowIndex = input[0].length - 1;
    int maxIndex = 0;
    for (int i = 0; i < input.length; i++) {
      int[] a = input[i];
      if (a[leastOneRowIndex] == 1) {
        while (leastOneRowIndex >= 0 && a[leastOneRowIndex] == 1) {
          leastOneRowIndex--;
        }
        maxIndex = i;
        if (leastOneRowIndex == -1) {
          return maxIndex;
        }
      }
    }
    return maxIndex;
  }

  public int getRowWithMaxOnesBinarySearch(int[][] input) {
    int maxOnes = 0;
    int maxIndex = 0;
    for (int i = 0; i < input.length; i++) {
      int[] a = input[i];
      if (a[a.length - 1 - maxOnes] == 1) {
        int firstIndex = getFirstIndexOfOne(a);
        if (maxOnes < a.length - firstIndex) {
          maxIndex = i;
          maxOnes = a.length - firstIndex;
        }
        if (maxOnes == a.length) {
          return maxIndex;
        }
      }
    }

    return maxIndex;
  }

  private int getFirstIndexOfOne(int[] a) {
    int left = 0, right = a.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (a[mid] == 1 && (mid == 0 || a[mid - 1] == 0)) {
        return mid;
      } else if (a[mid] == 0) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
