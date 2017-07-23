/**
 * Created by Sarveswara Tippireddy on Jul 23, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/second-most-repeated-string-in-a-sequence/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/second-repeated-word-sequence/
 */
package geeksForGeeks.practice.easy;

import java.util.HashMap;
import java.util.Scanner;

public class SecondMostRepeatedString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfTestCases = sc.nextInt();
    while (numberOfTestCases-- > 0) {
      int k = sc.nextInt();
      String[] input = new String[k];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.next();
      }
      System.out.println(getSecondMostRepeatedString(input));
    }
    sc.close();
  }

  public static String getSecondMostRepeatedString(String[] a) {
    HashMap<String, Integer> map = new HashMap<>();
    for (String s : a) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    int max = 0;
    int secondMax = 0;
    for (String s : map.keySet()) {
      Integer currFrequency = map.get(s);
      if (currFrequency > max) {
        int temp = max;
        max = currFrequency;
        secondMax = Integer.max(secondMax, temp);
      } else if (currFrequency > secondMax) {
        secondMax = currFrequency;
      }
    }
    for (String s : map.keySet()) {
      if (map.get(s) == secondMax) return s;
    }
    return "";
  }
}
