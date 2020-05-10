/**
 * Created by Sarveswara Tippireddy on Jul 22, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/count-subsequences-of-type-ai-bj-ck/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/number-subsequences-form-ai-bj-ck/
 *
 * <p>A better explanation can be found @
 * https://discuss.codechef.com/questions/92066/help-needed-for-solving-string-and-sub-sequences-problem/92116
 */
package geeksForGeeks.practice.medium;

import java.util.Scanner;

public class CountSubsequencesOfTypeaibjck {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      System.out.println(calculateEfficientSpaceUse(sc.next()));
    }
    sc.close();
  }

  public static int calculate(String s) {
    int[] dpA = new int[s.length() + 1];
    for (int i = 1; i < s.length() + 1; i++) {
      if (s.charAt(i - 1) == 'a') {
        dpA[i] = 2 * dpA[i - 1] + 1;
      } else {
        dpA[i] = dpA[i - 1];
      }
    }
    int[] dpAB = new int[s.length() + 1];
    for (int i = 1; i < s.length() + 1; i++) {
      if (s.charAt(i - 1) == 'b') {
        dpAB[i] = 2 * dpAB[i - 1] + dpA[i - 1];
      } else {
        dpAB[i] = dpAB[i - 1];
      }
    }
    int[] dpABC = new int[s.length() + 1];
    for (int i = 1; i < s.length() + 1; i++) {
      if (s.charAt(i - 1) == 'c') {
        dpABC[i] = 2 * dpABC[i - 1] + dpAB[i - 1];
      } else {
        dpABC[i] = dpABC[i - 1];
      }
    }
    return dpABC[s.length()];
  }

  public static int calculateEfficientSpaceUse(String s) {
    int countA = 0;
    int countAB = 0;
    int countABC = 0;
    for (int i = 1; i < s.length() + 1; i++) {
      if (s.charAt(i - 1) == 'a') {
        countA = 2 * countA + 1;
      } else if (s.charAt(i - 1) == 'b') {
        countAB = 2 * countAB + countA;
      } else {
        countABC = 2 * countABC + countAB;
      }
    }
    return countABC;
  }
}
