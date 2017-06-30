package geeksForGeeks.dynamicProgramming;

/**
 * @author Sarveswara Tippireddy
 *     <p>This GeeksforGeeks problem can be found @
 *     http://www.geeksforgeeks.org/dynamic-programming-set-3-longest-increasing-subsequence/
 */
public class Basics07 {
  public int findLIS(int[] a) {
    int[] lis = new int[a.length];
    lis[0] = 1;
    for (int i = 1; i < a.length; i++) {
      lis[i] = 1;
      for (int j = i - 1; j >= 0; j--) {
        if (a[i] > a[j]) {
          lis[i] = Integer.max(lis[i], lis[j] + 1);
        }
      }
    }
    int result = lis[0];
    for (int i = 1; i < lis.length; i++) {
      result = Integer.max(result, lis[i]);
    }
    return result;
  }
}
