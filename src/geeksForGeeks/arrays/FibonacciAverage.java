/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://practice.geeksforgeeks.org/problems/class-average/0
 */
package geeksForGeeks.arrays;

import java.util.Scanner;

public class FibonacciAverage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean[] f = new boolean[101];
    setFibonacciNumbers(f, 101);
    int n = sc.nextInt();
    while (n-- > 0) {
      int[] input = new int[sc.nextInt()];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(calculateAverage(input, f));
    }
    sc.close();
  }

  private static int calculateAverage(int[] input, boolean[] f) {
    int sum = 0;
    for (int i = 0; i < input.length; i++) {
      if (f[i + 1]) {
        int temp = input[i] * (i + 1);
        if (temp % 100 == 0) {
          temp = 100;
        } else {
          temp = temp % 100;
        }
        sum += temp;
      } else {
        sum += input[i];
      }
    }
    return sum / input.length;
  }

  private static void setFibonacciNumbers(boolean[] f, int l) {
    if (l > 0) f[0] = true;
    if (l > 1) f[1] = true;
    int prevToPrev = 0;
    int prev = 1;
    while (prevToPrev + prev < 101) {
      f[prev + prevToPrev] = true;
      int temp = prev + prevToPrev;
      prevToPrev = prev;
      prev = temp;
    }
  }
}
