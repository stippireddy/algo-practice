package leetCode;

public class LeetCode242 {
  /**
   * @param s : input string 1
   * @param t : input string 2
   * @return boolean which indicates if s and t are anagrams
   *     <p>This method uses an int array of size 26 to count the occurrences of the 26 small-case
   *     characters (specified in the problem statement that s and t contain only small-case
   *     characters).
   */
  public boolean isAnagram(String s, String t) {
    int sLength = s.length();
    int tLength = t.length();
    if (sLength != tLength) {
      return false;
    }
    int[] charCount = new int[26];
    for (char c : s.toCharArray()) {
      charCount[c - 'a']++;
    }
    for (char c : t.toCharArray()) {
      charCount[c - 'a']--;
    }
    for (int i : charCount) {
      if (i != 0) {
        return false;
      }
    }
    return true;
  }
}
