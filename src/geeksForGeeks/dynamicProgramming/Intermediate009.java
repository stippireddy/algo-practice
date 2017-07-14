/**
 * Created by Sarveswara Tippireddy on Jul 12, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/dynamic-programming-set-15-longest-bitonic-subsequence/
 */
package geeksForGeeks.dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Intermediate009 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(getMaxLengthBitonicSequence(input));
    }
    sc.close();
  }

  public static int getMaxLengthBitonicSequence(int[] input) {
    int[] lis = new int[input.length];
    Arrays.fill(lis, 1);
    int[] lds = new int[input.length];
    Arrays.fill(lds, 1);
    for (int i = 1; i < lis.length; i++) {
      int max = 0;
      for (int j = i - 1; j >= 0; j--) {
        if (input[i] > input[j]) {
          max = Integer.max(max, lis[j]);
        }
      }
      lis[i] = max + 1;
    }
    for (int i = lds.length - 2; i >= 0; i--) {
      int max = 0;
      for (int j = i + 1; j < lds.length; j++) {
        if (input[i] > input[j]) {
          max = Integer.max(max, lds[j]);
        }
      }
      lds[i] = max + 1;
    }
    int maxBitonic = 1;
    for (int i = 0; i < lis.length; i++) {
      maxBitonic = Integer.max(maxBitonic, lis[i] + lds[i] - 1);
    }
    return maxBitonic;
  }
}
