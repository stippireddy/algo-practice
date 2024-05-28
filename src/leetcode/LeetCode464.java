package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode464 {

  public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    Map<String, Boolean> map = new HashMap<>();
    if (maxChoosableInteger >= desiredTotal) {
      return true;
    }
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) {
      return false;
    }
    boolean[] choices = new boolean[maxChoosableInteger + 1];
    return canIWinHelper(choices, 0, desiredTotal, map);
  }

  private boolean canIWinHelper(boolean[] choices, int runningSum, int desiredTotal,
      Map<String, Boolean> dp) {
    String key = Arrays.toString(choices) + "  " + runningSum;
    if (dp.containsKey(key)) {
      return dp.get(key);
    }
    boolean result = false;
    for (int i = choices.length - 1; i > 0; i--) {
      if (!choices[i]) {
        if (runningSum + i >= desiredTotal) {
          return true;
        }
        choices[i] = true;
        result = result || !canIWinHelper(choices, runningSum + i, desiredTotal, dp);
        choices[i] = false;
      }
    }
    dp.put(key, result);
    return result;
  }
}
