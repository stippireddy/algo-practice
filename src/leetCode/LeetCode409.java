package leetCode;

public class LeetCode409 {

  public int longestPalindrome(String s) {
    int[] count = new int[128];
    for (char c : s.toCharArray()) {
      count[c]++;
    }
    int length = 0;
    boolean isOddUsed = false;
    for (int i : count) {
      if ((i & 1) != 0) {
        length += (i - 1);
        isOddUsed = true;
      } else {
        length += i;
      }
    }
    if (isOddUsed) {
      length++;
    }
    return length;
  }
}
