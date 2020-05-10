package leetCode;

public class LeetCode521 {

  public int findLUSlength(String a, String b) {
    int aLength = a.length();
    int bLength = b.length();
    if (!a.equals(b)) {
      if (aLength > bLength) {
        return aLength;
      }
      return bLength;
    }
    return -1;
  }
}
