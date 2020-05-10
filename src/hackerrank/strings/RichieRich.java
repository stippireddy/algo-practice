/**
 * Created by Sarveswara Tippireddy on Jul 11, 2017
 *
 * <p>This HackerRank problem can be found @
 * https://www.hackerrank.com/challenges/richie-rich/problem
 */
package hackerrank.strings;

public class RichieRich {

  static String richieRich(String s, int n, int count) {
    int i = 0, j = n - 1;
    StringBuffer sb = new StringBuffer(s);
    boolean[] flip = new boolean[n];
    char max = '9';
    while (i < j) {
      if (sb.charAt(i) != sb.charAt(j)) {
        if (count < 1) {
          return "-1";
        }
        if (sb.charAt(i) > sb.charAt(j)) {
          sb.setCharAt(j, sb.charAt(i));
          flip[j] = true;
        } else {
          sb.setCharAt(i, sb.charAt(j));
          flip[i] = true;
        }
        count--;
      }
      i++;
      j--;
    }
    i = 0;
    j = n - 1;
    while (i < j) {
      if (sb.charAt(i) != max) {
        if (count > 0) {
          if (flip[i] == true || flip[j] == true) {
            count++;
          }
          if (count > 1) {
            sb.setCharAt(i, max);
            sb.setCharAt(j, max);
            count -= 2;
          }
        }
      }
      i++;
      j--;
    }
    if (i == j && sb.charAt(i) != max && count > 0) {
      sb.setCharAt(i, max);
    }
    return sb.toString();
  }
}
