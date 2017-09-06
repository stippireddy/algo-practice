/**
 * Created by Sarveswara Tippireddy on Sep 5, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * 
 */
package leetCode;

public class LeetCode003 {
  public int lengthOfLongestSubstring(String s) {
    char[] sArray = s.toCharArray();
    int[] freq = new int[26];
    int i = 0, j = 0, maxLength = 0;
    while (j < sArray.length) {
      if (i < j && freq[sArray[i] - 'a'] > 0) {
        freq[sArray[i] - 'a'] = 0;
        i++;
      } else if (freq[sArray[j] - 'a'] == 0) {
        freq[sArray[j] - 'a'] = 1;
        maxLength = Integer.max(maxLength, j - i + 1);
        j++;
      }
    }
    return maxLength;
  }
}
