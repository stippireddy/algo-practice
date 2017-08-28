/**
 * Created by Sarveswara Tippireddy on Aug 27, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/student-attendance-record-i/description/
 */
package leetCode;

public class LeetCode551 {
  public boolean checkRecord(String s) {
    int countA = 0;
    int countL = 0;
    for (char c : s.toCharArray()) {
      if (c == 'A') {
        countA++;
        if (countA == 2) {
          return false;
        }
        countL = 0;
      } else if (c == 'P') {
        countL = 0;
      } else {
        countL++;
        if (countL > 2) {
          return false;
        }
      }
    }
    return true;
  }
}
