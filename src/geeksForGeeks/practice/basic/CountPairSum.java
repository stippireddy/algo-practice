/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/count-pair-sum/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/count-pairs-two-sorted-arrays-whose-sum-equal-given-value-x/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class CountPairSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int l = sc.nextInt();
      int[] input1 = new int[k];
      for (int i = 0; i < k; i++) {
        input1[i] = sc.nextInt();
      }
      int[] input2 = new int[l];
      for (int i = 0; i < l; i++) {
        input2[i] = sc.nextInt();
      }
      int sum = sc.nextInt();
      System.out.println(getPairCount(input1, input2, sum));
    }
    sc.close();
  }

  private static int getPairCount(int[] a, int[] b, int sum) {
    int count = 0;
    int i = 0, j = b.length - 1;
    while(i<a.length && j >=0){
      if(a[i]+b[j]==sum){
        count++;
        j--;
      } else if (a[i] + b[j] > sum) {
        j--;
      } else {
        i++;
      }
    }
    return count;
  }
}
