/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/add-binary/description/
 */
package leetcode;

public class LeetCode067 {

  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    while (i >= 0 || j >= 0) {
      int sum = carry;
      if (i < 0) {
        sum += (b.charAt(j) - '0');
        j--;
      } else if (j < 0) {
        sum += (a.charAt(i) - '0');
        i--;
      } else {
        sum += (b.charAt(j) - '0');
        sum += (a.charAt(i) - '0');
        i--;
        j--;
      }
      sb.append(sum % 2);
      carry = sum / 2;
    }
    if (carry > 0) {
      sb.append(carry);
    }
    return sb.reverse().toString();
  }
}
