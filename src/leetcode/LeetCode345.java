package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode345 {

  public String reverseVowels(String s) {
    char[] input = s.toCharArray();
    int i = 0, j = input.length - 1;
    HashSet<Character> vowels =
        new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    while (i < j) {
      if (!vowels.contains(input[i])) {
        i++;
        continue;
      }
      if (!vowels.contains(input[j])) {
        j--;
        continue;
      }
      if (i < j) {
        char temp = input[i];
        input[i] = input[j];
        input[j] = temp;
        i++;
        j--;
      }
    }
    return String.valueOf(input);
  }
}
