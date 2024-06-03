package leetcode;

public class Leetcode5 {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            left++;
            right--;
            if (longestPalindrome.length() < right - left + 1) {
                longestPalindrome = s.substring(left, right + 1);
            }
        }

        for (int i = 1; i < s.length(); i++) {
            int left = i - 1, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            left++;
            right--;
            if (longestPalindrome.length() < right - left + 1) {
                longestPalindrome = s.substring(left, right + 1);
            }
        }
        return longestPalindrome;
    }
}
