package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode412 {

  public List<String> fizzBuzz(int n) {
    ArrayList<String> output = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 15 == 0) {
        output.add("FizzBuzz");
      } else if (i % 5 == 0) {
        output.add("Buzz");
      } else if (i % 3 == 0) {
        output.add("Fizz");
      } else {
        output.add("" + i);
      }
    }
    return output;
  }
}
