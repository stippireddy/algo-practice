/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/
 */
package geeksForGeeks.arrays;

import java.util.Scanner;

public class Arrays20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int[] input = new int[sc.nextInt()];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      printMaxAndNextMax(input);
    }
    sc.close();
  }

  public static void printMaxAndNextMax(int[] a) {
    if (a.length < 1) {
      System.out.println("-1");
    }
    int nextLeast = Integer.MAX_VALUE;
    int least = Integer.MAX_VALUE;
    if (a[0] > a[1]) {
      nextLeast = a[0];
      least = a[1];
    } else {
      nextLeast = a[1];
      least = a[0];
    }
    for (int i = 2; i < a.length; i++) {
      if (a[i] < nextLeast && a[i] != least) {
        nextLeast = a[i];
        if (nextLeast < least) {
          int temp = least;
          least = nextLeast;
          nextLeast = temp;
        }
      }
    }
    if (least == nextLeast) {
      System.out.println(-1);
    } else {
      System.out.println(least + " " + nextLeast);
    }
  }
}
