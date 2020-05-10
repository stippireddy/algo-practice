package leetCode;

/**
 * Created by Sarveswara Tippireddy on 5/17/2017.
 */
public class LeetCode541 {

  public String reverseStr(String s, int k) {
    if (s.length() <= 1) {
      return s;
    }
    int i = 0;
    char[] input = s.toCharArray();
    while (i < s.length()) {
      reverse(input, i, i + k - 1);
      i = i + 2 * k;
    }
    return String.valueOf(input);
  }

  private void reverse(char[] input, int i, int j) {
    int k = Integer.min(j, input.length - 1);
    while (i < k) {
      char temp = input[i];
      input[i] = input[k];
      input[k] = temp;
      i++;
      k--;
    }
  }
}
