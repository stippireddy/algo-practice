/**
 * Created by Sarveswara Tippireddy on Aug 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/majority-element/0
 *
 * <p>The solution editorial can be found @ http://www.geeksforgeeks.org/majority-element/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class MajorityElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      int majorityElement = getMajorityElement(input);
      if (majorityElement == -1) {
        System.out.println("NO Majority Element");
      } else {
        System.out.println(majorityElement);
      }
      
    }
    sc.close();
  }

  private static int getMajorityElement(int[] a) {
    int num = 0;
    for (int i = 0; i < 32; i++) {
      int n = 1 << i;
      int count = 0;
      for (int j = 0; j < a.length; j++) {
        if ((a[j] & n) != 0) {
          count++;
        }
      }
      if (count > a.length / 2) {
        num = num | n;
      }
    }
    int freq = 0;
    for (int i : a) {
      if (num == i) {
        freq++;
      }
    }
    if (freq > a.length / 2) {
      return num;
    }
    return -1;
  }
}
