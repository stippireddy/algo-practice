package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode118 {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    if (numRows < 1) {
      return result;
    }
    result.add(new ArrayList<Integer>(Arrays.asList(1)));
    for (int i = 1; i < numRows; i++) {
      ArrayList<Integer> subList = new ArrayList<>();
      result.add(subList);
      subList.add(1);
      List<Integer> prev = result.get(i - 1);
      for (int j = 0; j + 1 < prev.size(); j++) {
        subList.add(prev.get(j) + prev.get(j + 1));
      }
      subList.add(1);
    }
    return result;
  }
}
