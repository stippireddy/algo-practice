package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode784 {

  public List<String> letterCasePermutation(String S) {
    List<String> result = new ArrayList<>();
    helper(result, S.toCharArray(), 0);
    return result;
  }

  private void helper(List<String> result, char[] input, int index) {
    if (index == input.length) {
      result.add(String.valueOf(input));
      return;
    }
    if (Character.isAlphabetic(input[index])) {
      input[index] = Character.toUpperCase(input[index]);
      helper(result, input, index + 1);
      input[index] = Character.toLowerCase(input[index]);
      helper(result, input, index + 1);
    } else {
      helper(result, input, index + 1);
    }
  }
}

