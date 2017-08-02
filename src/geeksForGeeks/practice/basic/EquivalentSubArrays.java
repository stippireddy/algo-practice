/**
 * Created by Sarveswara Tippireddy on Aug 2, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/equivalent-sub-arrays/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/count-subarrays-total-distinct-elements-original-array/
 */
package geeksForGeeks.practice.basic;

import java.util.HashSet;
import java.util.Scanner;

public class EquivalentSubArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int[] input = new int[n];
      for (int i = 0; i < n; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(getNumberOfEquivalentSubarrays(input));
    }
    sc.close();
  }

  private static int getNumberOfEquivalentSubarrays(int[] a) {
    HashSet<Integer> set = new HashSet<>();
    int[] hash = new int[101];
    for (int i : a) {
      set.add(i);
    }
    int left = 0, right = 0, count = 0;
    int subArrayCount = 0;
    while (left < a.length && right < a.length) {
      while (right < a.length) {
        int i = a[right];
        hash[i]++;
        if (hash[i] == 1) {
          count++;
        }
        right++;
        if (count == set.size()) {
          subArrayCount += (a.length - right + 1);
          break;
        }
      }
      while (count == set.size() && left < a.length) {
        int i = a[left];
        hash[i]--;
        if (hash[i] == 0) {
          count--;
          left++;
          break;
        }
        left++;
        subArrayCount += (a.length - right + 1);
      }
    }
    return subArrayCount;
  }
}
