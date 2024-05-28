/**
 * Created by Sarveswara Tippireddy on Sep 12, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/unique-paths/description/
 */
package leetcode;

public class LeetCode062 {

  public int uniquePaths(int m, int n) {
    int max = n - 1;
    int min = m - 1;
    if (m > n) {
      max = m - 1;
      min = n - 1;
    }
    long result = 1;
    int i = max + 1;
    int j = 1;
    for (; i <= min + max; i++, j++) {
      result *= i;
      result /= j;
    }
    return (int) result;
  }
}
