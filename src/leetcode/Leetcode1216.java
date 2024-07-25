package leetcode;

public class Leetcode1216 {
    // dp[i][j] denotes the minimum number of characters that need to be deleted for s.substring(i, j+1) to be a palindrome
    // dp[i][j] = s.charAt(i) == s.charAt(j) ? dp[i+1][j-1] : 1 + min(dp[i+1][j], dp[i][j-1])
    // To write a bottom-up solution, we need to iterate the substrings in a peculiar order.
    // Iterate all substrings in the increasing order of length
    // Ex: abcdeca => a, b, c, d, e, c, a, ab, bc, cd, de, ec, ca, abc, bcd ....
    public boolean isValidPalindrome(String s, int k) {
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        for (int l = 1; l < s.length(); l++) {
            for (int i = 0; i + l < s.length(); i++) {
                int j = i + l;
                if (s.charAt(i) == s.charAt(j)) {
                    if (i + 1 > j - 1) {
                        dp[i + 1][j + 1] = 0;
                    } else {
                        dp[i + 1][j + 1] = dp[i + 2][j];
                    }
                } else {
                    dp[i + 1][j + 1] = 1 + Integer.min(dp[i + 2][j + 1], dp[i + 1][j]);
                }
            }

        }
        return dp[1][s.length()] <= k;
    }
}
