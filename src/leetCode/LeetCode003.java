/**
 * Created by Sarveswara Tippireddy on Sep 5, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
package leetCode;

public class LeetCode003 {

  public int lengthOfLongestSubstring(String s) {
    char[] sArray = s.toCharArray();
    int[] freq = new int[128];
    int i = 0, j = 0, maxLength = 0;
    while (j < sArray.length) {
      if (freq[sArray[j]] == 0) {
        freq[sArray[j]] = 1;
        maxLength = Integer.max(maxLength, j - i + 1);
        j++;
      } else {
        freq[sArray[i]] = 0;
        i++;
      }
    }
    return maxLength;
  }
}
