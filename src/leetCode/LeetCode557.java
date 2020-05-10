package leetCode;

import java.util.StringTokenizer;

/**
 * Created by Sarveswara Tippireddy on 5/17/2017.
 */
public class LeetCode557 {

  public static void main(String[] args) {
    LeetCode557 l = new LeetCode557();
    System.out.println(l.reverseWordsEfficiently("Let's take LeetCode contest"));
    ;
  }

  public String reverseWords(String s) {
    if (s.length() <= 1) {
      return s;
    }
    StringTokenizer tokenizer = new StringTokenizer(s);
    StringBuffer sb = new StringBuffer();
    while (tokenizer.hasMoreTokens()) {
      String curr = tokenizer.nextToken();
      for (int i = curr.length() - 1; i >= 0; i--) {
        sb.append(curr.charAt(i));
      }
      sb.append(' ');
    }
    sb.deleteCharAt(s.length());
    return sb.toString();
  }

  public String reverseWordsEfficiently(String s) {
    if (s.length() <= 1) {
      return s;
    }
    char[] input = s.toCharArray();
    int i = 0;
    for (int k = 0; k < input.length; k++) {
      if (input[k] == ' ') {
        reverse(input, i, k - 1);
        i = k + 1;
      }
    }
    if (i < input.length) {
      reverse(input, i, input.length - 1);
    }

    return String.valueOf(input);
  }

  private void reverse(char[] input, int i, int j) {
    while (i < j) {
      char temp = input[i];
      input[i] = input[j];
      input[j] = temp;
      i++;
      j--;
    }
  }
}
