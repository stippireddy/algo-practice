/**
 * Created by Sarveswara Tippireddy on Oct 18, 2017
 *
 * <p>
 * This GeeksForGeeks problem can be found @
 * http://practice.geeksforgeeks.org/problems/unsorted-array/0
 *
 * <p>
 * The solution editorials can be found @
 * http://www.geeksforgeeks.org/find-the-element-before-which-all-the-elements-are-smaller-than-it-and-after-which-all-are-greater-than-it/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class LeftElementsSmallerRightElementsLarger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(findElement(input));
    }
    sc.close();
  }

  private static int findElement(int[] input) {
    int[] small = new int[input.length];
    int[] large = new int[input.length];
    large[input.length - 1] = Integer.MAX_VALUE;
    for (int i = 1; i < input.length; i++) {
      small[i] = Integer.max(small[i - 1], input[i - 1]);
    }
    for (int i = input.length - 2; i >= 0; i--) {
      large[i] = Integer.min(input[i + 1], large[i + 1]);
    }
    for (int i = 1; i < input.length - 1; i++) {
      if (input[i] >= small[i] && input[i] <= large[i]) {
        return input[i];
      }
    }
    return -1;
  }
}
