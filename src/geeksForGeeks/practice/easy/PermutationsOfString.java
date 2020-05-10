/**
 * Created by Sarveswara Tippireddy on Oct 09, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://www.geeksforgeeks.org/?p=767
 */
package geeksForGeeks.practice.easy;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationsOfString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String input = sc.next();
      printPermutations(input.toCharArray(), 0, input.length() - 1);
    }
    sc.close();
  }

  private static void printPermutations(char[] input, int l, int r) {
    char[] s = Arrays.copyOf(input, input.length);
    if (l == r) {
      System.out.println(s);
      return;
    }
    for (int i = l; i <= r; i++) {
      swap(s, l, i);
      printPermutations(s, l + 1, r);
    }
  }

  private static void swap(char[] string, int l, int i) {
    char temp = string[l];
    string[l] = string[i];
    string[i] = temp;
  }
}
