/**
 * Created by Sarveswara Tippireddy on Aug 27, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/valid-palindrome/description/
 */
package leetcode;

public class LeetCode125 {

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
