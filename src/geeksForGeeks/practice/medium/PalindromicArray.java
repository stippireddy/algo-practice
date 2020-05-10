/**
 * Created by Sarveswara Tippireddy on Jul 23, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/palindromic-array/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/find-minimum-number-of-merge-operations-to-make-an-array-palindrome/
 */
package geeksForGeeks.practice.medium;

import java.util.Scanner;

public class PalindromicArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfTestCases = sc.nextInt();
    while (numberOfTestCases-- > 0) {
      int n = sc.nextInt();
      int[] input = new int[n];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(getNumberOfOperations(input));
    }
    sc.close();
  }

  public static int getNumberOfOperations(int[] input) {
    int opCount = 0;
    int i = 0, j = input.length - 1;
    while (i < j) {
      if (input[i] == input[j]) {
        i++;
        j--;
      } else if (input[i] < input[j]) {
        input[i + 1] = input[i] + input[i + 1];
        opCount++;
        i++;
      } else {
        input[j - 1] = input[j] + input[j - 1];
        opCount++;
        j--;
      }
    }
    return opCount;
  }
}
