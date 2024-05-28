package leetcode;

public class LeetCode076 {

  public static void main(String[] args) {
    LeetCode076 l = new LeetCode076();
    System.out.println(l.minWindow("a",
        "a"));
    ;
  }

  public String minWindow(String s, String t) {
    int[] tFreq = new int[256];
    for (char c : t.toCharArray()) {
      tFreq[c]++;
    }
    int i = 0;
    int j = 0;
    int minLength = s.length() + 1;
    int minLeft = 0;
    int minRight = s.length();
    int[] sFreq = new int[256];
    while (i < s.length() && j < s.length()) {
      sFreq[s.charAt(j)]++;
      while (i <= j && isFreqEqual(sFreq, tFreq)) {
        int currentLength = j - i + 1;
        if (minLength > currentLength) {
          minLength = currentLength;
          minLeft = i;
          minRight = j + 1;
        }
        sFreq[s.charAt(i)]--;
        i++;
      }
      j++;
    }
    return minLength > s.length() ? s.substring(minLeft, minRight) : "";
  }

  private boolean isFreqEqual(int[] sFreq, int[] tFreq) {
    for (int i = 0; i < 256; i++) {
      if (tFreq[i] > 0 && tFreq[i] > sFreq[i]) {
        return false;
      }
    }
    return true;
  }
}
