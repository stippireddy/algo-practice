/**
 * Created by Sarveswara Tippireddy on Jul 15, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/stable-sort-and-position/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/position-element-stable-sort/
 */
package geeksForGeeks.practice.basic;

import java.awt.Point;
import java.util.Scanner;

public class StableSortAndPosition {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int inputSize = sc.nextInt();
      int keyIndex = sc.nextInt();
      int[] input = new int[inputSize];
      for (int i = 0; i < inputSize; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(findIndexAfterStableSort1(input, keyIndex));
    }
    sc.close();
  }

  public static int findIndexAfterStableSort1(int[] input, int keyIndex) {
    Point[] points = new Point[input.length];
    for (int i = 0; i < input.length; i++) {
      points[i] = new Point(input[i], i);
    }
    mergeSort(points, 0, points.length - 1);
    for (int i = 0; i < points.length; i++) {
      if (points[i].y == keyIndex) {
        return i;
      }
    }
    return -1;
  }

  private static void mergeSort(Point[] input, int left, int right) {
    if (left < right) {
      int mid = left + (right - left) / 2;
      mergeSort(input, left, mid);
      mergeSort(input, mid + 1, right);
      merge(input, left, mid, right);
    }
  }

  private static void merge(Point[] input, int left, int mid, int right) {
    Point[] temp = new Point[right - left + 1];
    int i = left, j = mid + 1, k = 0;
    while (i <= mid && j <= right) {
      if (input[j].x < input[i].x) {
        temp[k] = input[j];
        j++;
      } else {
        temp[k] = input[i];
        i++;
      }
      k++;
    }
    while (i <= mid) {
      temp[k] = input[i];
      i++;
      k++;
    }
    while (j <= right) {
      temp[k] = input[j];
      j++;
      k++;
    }
    for (i = left, k = 0; i <= right; i++) {
      input[i] = temp[k];
      k++;
    }
  }

  public static int findIndexAfterStableSort2(int[] input, int keyIndex) {
    int index = 0;
    for (int i = 0; i < input.length; i++) {
      if (input[i] < input[keyIndex]) {
        index++;
      }
    }
    for (int i = 0; i < keyIndex; i++) {
      if (input[i] == input[keyIndex]) {
        index++;
      }
    }
    return index;
  }
}
