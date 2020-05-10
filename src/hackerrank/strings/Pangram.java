package hackerrank.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangram {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int[] count = new int[26];
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) != ' ') {
        if (Character.isUpperCase(input.charAt(i))) {
          count[input.charAt(i) - 'A'] = 1;
        } else {
          count[input.charAt(i) - 'a'] = 1;
        }
      }
    }
    String returnVal = "pangram";
    for (int i : count) {
      if (i == 0) {
        returnVal = "not pangram";
        break;
      }
    }
    System.out.println(returnVal);
  }
}
