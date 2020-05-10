/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/add-binary/description/
 */
package leetCode;

public class LeetCode067 {

  public String addBinary(String a, String b) {
    int i = a.length() - 1, j = b.length() - 1;
    int carry = 0;
    StringBuffer sb = new StringBuffer();
    while (i >= 0 && j >= 0) {
      int temp = a.charAt(i) - '0' + b.charAt(j) - '0' + carry;
      carry = temp / 2;
      sb.append(temp % 2);
      i--;
      j--;
    }
    while (i >= 0) {
      int temp = a.charAt(i) - '0' + carry;
      carry = temp / 2;
      sb.append(temp % 2);
      i--;
    }
    while (j >= 0) {
      int temp = b.charAt(j) - '0' + carry;
      carry = temp / 2;
      sb.append(temp % 2);
      j--;
    }
    return carry == 0 ? sb.reverse().toString() : sb.append('1').reverse().toString();
  }
}
