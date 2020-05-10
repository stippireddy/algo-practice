/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/first-come-first-serve/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/first-element-occurring-k-times-array/
 */
package geeksForGeeks.practice.basic;

import java.util.HashMap;
import java.util.Scanner;

public class FirstComeFirstServe {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int count = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(getNum(input, count));
    }
    sc.close();
  }

  private static int getNum(int[] input, int count) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : input) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    for (int i : input) {
      if (map.get(i) == count) {
        return i;
      }
    }
    return -1;
  }
}
