/**
 * Created by Sarveswara Tippireddy on Jul 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/relative-sorting/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/sort-array-according-order-defined-another-array/
 */
package geeksForGeeks.practice.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class RelativeOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int l = sc.nextInt();
      Integer[] input1 = new Integer[k];
      Integer[] input2 = new Integer[l];
      for (int i = 0; i < k; i++) {
        input1[i] = sc.nextInt();
      }
      for (int i = 0; i < l; i++) {
        input2[i] = sc.nextInt();
      }
      reOrder(input1, input2);
    }
    sc.close();
  }

  private static void reOrder(Integer[] input1, Integer[] input2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < input2.length; i++) {
      map.put(input2[i], i);
    }
    Arrays.sort(
        input1,
        new Comparator<Integer>() {

          @Override
          public int compare(Integer o1, Integer o2) {
            if (map.containsKey(o1) && map.containsKey(o2)) {
              return map.get(o1) - map.get(o2);
            }
            if (map.containsKey(o1) && !map.containsKey(o2)) {
              return 1;
            }
            if (!map.containsKey(o1) && map.containsKey(o2)) {
              return -1;
            }
            return Integer.compare(o1, o2);
          }
        });
    StringBuffer sb = new StringBuffer();
    for (int i : input1) {
      sb.append(i).append(" ");
    }
    System.out.println(sb.substring(0, sb.length() - 1));
  }
}

