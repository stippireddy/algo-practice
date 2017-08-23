/**
 * Created by Sarveswara Tippireddy on Jul 4, 2017
 *
 * <p>This InterviewBit problem can be found @
 * https://www.interviewbit.com/problems/pascal-triangle-rows/
 */
package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalTriangleRows {
  public static ArrayList<ArrayList<Integer>> generate(int a) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    if (a < 1) return result;
    result.add(new ArrayList<>(Arrays.asList(1)));
    for (int i = 1; i < a; i++) {
      ArrayList<Integer> subList = new ArrayList<>();
      subList.add(1);
      ArrayList<Integer> prevList = result.get(i - 1);
      for (int j = 1; j < i; j++) {
        subList.add(prevList.get(j - 1) + prevList.get(j));
      }
      subList.add(1);
      result.add(subList);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(generate(10));
  }
}
