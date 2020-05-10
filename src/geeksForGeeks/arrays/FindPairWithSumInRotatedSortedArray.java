/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/
 */
package geeksForGeeks.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class FindPairWithSumInRotatedSortedArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int[] input = new int[sc.nextInt()];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      HashMap<Integer, Integer> map = new HashMap<>();
      int minIndex = input.length;
      for (int i = 0; i < input.length; i++) {
        Integer val = map.get(input[i]);
        if (val != null && val < minIndex) {
          minIndex = map.get(i);
        } else {
          map.put(input[i], i);
        }
      }
    }
    sc.close();
  }

  public int[] findPair(int[] a, int k) {
    int[] result = new int[]{-1, -1};
    int n = a.length;
    int maxIndex = findMaxIndex(a);
    int minIndex = (maxIndex + 1) % n;
    int rotation = n - minIndex;
    int i = minIndex, j = maxIndex;
    while ((i + rotation) % n < (j + rotation) % n) {
      int tempSum = a[i % n] + a[j % n];
      if (tempSum == k) {
        result[0] = a[i % n];
        result[1] = a[j % n];
        break;
      } else if (tempSum < k) {
        i++;
      } else {
        j--;
      }
    }
    return result;
  }

  private int findMaxIndex(int[] a) {
    int left = 0, right = a.length - 1;
    while (left <= right) {
      if (a[left] < a[right]) {
        return right;
      }
      int mid = left + (right - left) / 2;
      if (mid > left && a[mid - 1] > a[mid]) {
        return mid - 1;
      }
      if (mid < right && a[mid + 1] < a[mid]) {
        return mid;
      }
      if (a[mid] > a[left]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
