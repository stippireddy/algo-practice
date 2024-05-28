package leetcode;

public class LeetCode91 {

  public static void main(String[] args) {
    LeetCode91 l = new LeetCode91();
    System.out.println(l.numDecodings("1212"));
  }

  public int numDecodings(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    if (s.length() == 1) {
      return 1;
    }
    if (s.length() == 2) {
      // TODO add logic to parse and check if valid
      return 2;
    }
    return numDecodings(s.substring(0, s.length() - 1)) + numDecodings(
        s.substring(0, s.length() - 2));
  }
}
