/**
 * Created by Sarveswara Tippireddy on Jul 15, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/twice-counter/0
 *
 * <p>The solution editorials can be found @
 * www.geeksforgeeks.org/shuffle-2n-integers-format-a1-b1-a2-b2-a3-b3-bn-without-using-extra-space/
 */
package geeksForGeeks.practice.basic;

import java.util.HashMap;
import java.util.Scanner;

public class TwiceCounter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      String[] input = new String[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.next();
      }
      System.out.println(countTwiceWords(input));
    }
    sc.close();
  }

  private static int countTwiceWords(String[] input) {
    HashMap<String, Integer> map = new HashMap<>();
    for (String s : input) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    int count = 0;
    for (int value : map.values()) {
      if (value == 2) {
        count++;
      }
    }
    return count;
  }
}
