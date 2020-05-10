/**
 * Created by Sarveswara Tippireddy on Jul 15, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/shuffle-integers/0
 *
 * <p>The solution editorials can be found @
 * www.geeksforgeeks.org/shuffle-2n-integers-format-a1-b1-a2-b2-a3-b3-bn-without-using-extra-space/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class ShuffleIntegers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(shuffle(input));
    }
    sc.close();
  }

  private static String shuffle(int[] input) {
    StringBuffer sb = new StringBuffer();
    int mid = input.length / 2;
    int i = 0, j = mid;
    while (i < mid && j < input.length) {
      sb.append(input[i]).append(" ");
      sb.append(input[j]).append(" ");
      i++;
      j++;
    }
    if (j < input.length) {
      sb.append(input[j]).append(" ");
    }
    return sb.length() > 0 ? sb.deleteCharAt(sb.length() - 1).toString() : "";
  }
}
