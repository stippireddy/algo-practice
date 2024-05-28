package leetcode;

public class LeetCode522 {

  public int findLUSlength(String[] strs) {
    int length = strs.length;
    int maxLength = strs[0].length();
    for (int i = 1; i < length; i++) {
      maxLength = Math.max(maxLength, strs[i].length());

    }
    if (maxLength == strs[0].length()) {
      boolean allStringsSame = true;
      String prevString = strs[0];
      for (int i = 1; i < length; i++) {
        if (!prevString.equals(strs[i])) {
          allStringsSame = false;
          break;
        }
      }
      if (allStringsSame) {
        maxLength = -1;
      }
    }

    return maxLength;
  }
}
