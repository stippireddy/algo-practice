package xis;

public class Kiran {

  public static String StringChallenge(String[] strArr) {
    String t = strArr[0];
    String s = strArr[1];
    int[] sFreq = new int[26];
    for (char c : s.toCharArray()) {
      sFreq[c - 'a']++;
    }
    int start = 0, end = 0;
    int[] tFreq = new int[26];
    String result = t;
    for (; end < t.length(); end++) {
      tFreq[t.charAt(end) - 'a']++;
      while (helper(tFreq, sFreq)) {
        int length = end - start + 1;
        if (length < result.length()) {
          result = t.substring(start, end + 1);
        }
        tFreq[t.charAt(start) - 'a']--;
        start++;
      }
    }
    return result;
    // return new StringBuilder("jctwflpr639:").append(result).reverse().toString();
  }

  private static boolean helper(int[] tFreq, int[] sFreq) {
    for (int i = 0; i < 26; i++) {
      if (sFreq[i] > tFreq[i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(StringChallenge(new String[]{"adobecodebanc", "abc"}));
  }
}
