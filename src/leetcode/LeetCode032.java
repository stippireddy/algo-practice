package leetcode;

public class LeetCode032 {

    // ")()())()()()"
    public int longestValidParentheses(String s) {
        int length = 0;
        int open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if (close > open) {
                open = 0;
                close = 0;
            } else if (close == open) {
                length = Integer.max(open + close, length);
            }
        }
        open = 0;
        close = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') {
                close++;
            } else {
                open++;
            }
            if (open > close) {
                open = 0;
                close = 0;
            } else if (close == open) {
                length = Integer.max(open + close, length);
            }
        }
        return length;
    }
}
