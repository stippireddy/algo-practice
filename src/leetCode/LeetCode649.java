/**
 * Created by Sarveswara Tippireddy on Jul 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @ link
 */
package leetCode;

public class LeetCode649 {
  a
  public String predictPartyVictory(String senate) {
    StringBuffer sb = new StringBuffer(senate);
    while (sb.length() > 1) {
      int i = 0, j = 1;
      for (; i < sb.length(); i++) {
        char c = sb.charAt(i);
        while (j % sb.length() != i && sb.charAt(j % sb.length()) == c) {
          j++;
        }
        if (j % sb.length() != i) {
          sb.deleteCharAt(j);
        } else {
          return sb.charAt(i) == 'R' ? "Radiant" : "Dire";
        }
      }
    }
    return sb.charAt(0) == 'R' ? "Radiant" : "Dire";
  }
  public static void main(String[] args) {
    System.out.println(new LeetCode649().predictPartyVictory("RD"));
    System.out.println(new LeetCode649().predictPartyVictory("RDD"));
    System.out.println(new LeetCode649().predictPartyVictory("RRD"));
    System.out.println(new LeetCode649().predictPartyVictory("RRDD"));
    System.out.println(new LeetCode649().predictPartyVictory("RDDR"));
    System.out.println(new LeetCode649().predictPartyVictory("RRDDD"));
  }
}
