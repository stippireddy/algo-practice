/**
 * Created by Sarveswara Tippireddy on Oct 18, 2017
 *
 * <p>
 * This GeeksForGeeks problem can be found @
 * http://practice.geeksforgeeks.org/problems/product-array-puzzle/0
 *
 * <p>
 * The solution editorials can be found @ 
 * http://www.geeksforgeeks.org/a-product-array-puzzle/
 * http://www.geeksforgeeks.org/product-array-puzzle-set-2-o1-space/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class ProductArrayPuzzle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      int[] result = getProduct(input);
      print(result);
    }
    sc.close();
  }

  private static void print(int[] result) {
    StringBuffer sb = new StringBuffer();
    for (int i : result) {
      sb.append(i).append(" ");
    }
    System.out.println(sb.substring(0, sb.length() - 1));
  }

  private static int[] getProduct(int[] input) {
    int[] result = new int[input.length];
    result[0] = 1;
    for (int i = 1; i < input.length; i++) {
      result[i] = result[i - 1] * input[i - 1];
    }
    int temp = 1;
    for (int i = input.length - 1; i >= 0; i--) {
      result[i] = result[i] * temp;
      temp *= input[i];
    }
    return result;
  }
}
