/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://practice.geeksforgeeks.org/problems/good-pairs/0
 */
package geeksForGeeks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GoodPairs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int[] input = new int[sc.nextInt()];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(getCount(input));
    }
    sc.close();
  }

  public static int getCount(int[] input) {
    Arrays.sort(input);
    int count = 0;
    int freq = 0;
    for (int i = 0; i < input.length - 1; i++) {
      freq++;
      if (input[i] != input[i + 1]) {
        count = count + (freq * (input.length - 1 - i));
        freq = 0;
      }
    }
    return count;
  }
}
