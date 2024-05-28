package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode676 {

  class MagicDictionary {

    Set<String> magicDictionary;

    /**
     * Initialize your data structure here.
     */
    public MagicDictionary() {
      magicDictionary = new HashSet<>();
    }

    public void buildDict(String[] dictionary) {
      for (String s : dictionary) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
          char originalChar = charArray[i];
          for (char c = 'a'; c <= 'z'; c++) {
            if (c != originalChar) {
              charArray[i] = c;
              magicDictionary.add(String.valueOf(charArray));
            }
          }
          charArray[i] = originalChar;
        }
      }
    }

    public boolean search(String searchWord) {
      return magicDictionary.contains(searchWord);
    }
  }
}
