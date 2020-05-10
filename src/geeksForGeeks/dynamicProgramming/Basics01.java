/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 */
package geeksForGeeks.dynamicProgramming;

public class Basics01 {

  public int giveNthFibonacciDP(int n) {
    if (n == 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }
    int prevToPrev = 0;
    int prev = 1;
    for (int i = 2; i < n; i++) {
      int temp = prevToPrev + prev;
      prevToPrev = prev;
      prev = temp;
    }
    return prev;
  }
}
