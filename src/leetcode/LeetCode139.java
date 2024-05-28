package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode139 {

  public boolean wordBreak(String s, List<String> wordDict) {
    Set<String> dictionary = new HashSet<>(wordDict);
    boolean[] dp = new boolean[s.length()];
    helper(s, wordDict, dp, 0);
    return dp[s.length() - 1];
  }

  private void helper(String s, List<String> wordDict, boolean[] dp, int i) {
    if (i == s.length()) {
      return;
    }
    for (int j = i + 1; j <= s.length(); j++) {

    }
  }
  //   public boolean wordBreak(String s, List<String> wordDict) {
  //   Set<String> dictionary = new HashSet<>(wordDict);
  //   Boolean[] dp = new Boolean[s.length() + 1];
  //   dp[0] = true;
  //   return helper(s, dictionary, dp, s.length() - 1);
  // }
  //
  // private boolean helper(String s, Set<String> dictionary, Boolean[] dp, int i) {
  //   if (dp[i + 1] != null) {
  //     return dp[i + 1];
  //   }
  //   for (int j = i; j >= 0; j--) {
  //     if (dictionary.contains(s.substring(j, i + 1)) && helper(s, dictionary, dp, j - 1)) {
  //       dp[i + 1] = true;
  //       return true;
  //     }
  //   }
  //   dp[i + 1] = false;
  //   return dp[i + 1];
  // }
}
