/**
 * Created by Sarveswara Tippireddy on Sep 1, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/complex-number-multiplication/description/
 */
package leetCode;

public class LeetCode537 {

  public String complexNumberMultiply(String a, String b) {
    String[] aSplit = a.split("\\+");
    String[] bSplit = b.split("\\+");
    StringBuffer result = new StringBuffer();
    int a1 = Integer.parseInt(aSplit[0]);
    int b1 = Integer.parseInt(bSplit[0]);
    int a2 = Integer.parseInt(aSplit[1].substring(0, aSplit[1].length() - 1));
    int b2 = Integer.parseInt(bSplit[1].substring(0, bSplit[1].length() - 1));
    return result.append(a1 * b1 - a2 * b2).append("+").append(a1 * b2 + a2 * b1).append("i")
        .toString();

  }
}
