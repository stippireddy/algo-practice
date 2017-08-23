/**
 * Created by Sarveswara Tippireddy on Aug 23, 2017
 *
 * <p>This LeetCode problem can be found @
 * https://leetcode.com/problems/judge-route-circle/description/
 */
package leetCode;

public class LeetCode657 {
  public boolean judgeCircle(String moves) {
    int netHorizontalDistance = 0;
    int netVerticalDistance = 0;
    for (char c : moves.toCharArray()) {
      switch (c) {
        case 'R':
          netHorizontalDistance++;
          break;
        case 'L':
          netHorizontalDistance--;
          break;
        case 'U':
          netVerticalDistance++;
          break;
        case 'D':
          netVerticalDistance--;
          break;
        default:
          break;
      }
    }
    return netHorizontalDistance == 0 && netVerticalDistance == 0;
  }
}
