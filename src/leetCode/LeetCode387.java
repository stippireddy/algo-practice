package leetCode;

/**
 * Created by Sarveswara Tippireddy on 5/18/2017.
 */
public class LeetCode387 {
    public int firstUniqChar(String s) {
        int[] lowerCaseChars = new int[26];
        char[] input = s.toCharArray();
        for (char c: input) {
            lowerCaseChars[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (lowerCaseChars[input[i]- 'a']  == 1) {
                return i;
            }
        }
        return -1;
    }
}
