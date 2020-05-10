package leetCode;

public class LeetCode389 {

  public char findTheDifference(String s, String t) {
    int[] charCount = new int[26];
    for (int i = 0; i < t.length(); i++) {
      charCount[t.charAt(i) - 'a']++;
    }
    for (int i = 0; i < s.length(); i++) {
      charCount[s.charAt(i) - 'a']--;
    }
    for (int i = 0; i < charCount.length; i++) {
      if (charCount[i] == 1) {
        return (char) (97 + i);
      }
    }
    return ' ';
  }

  public char findTheDifferenceUsingXOR(String s, String t) {
    char diff = '1';
    for (char c : s.toCharArray()) {
      diff ^= c;
    }
    for (char c : t.toCharArray()) {
      diff ^= c;
    }
    return diff ^= '1';
  }
}
