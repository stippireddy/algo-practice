/**
 * Created by Sarveswara Tippireddy on Jul 4, 2017
 *
 * <p>This InterviewBit problem can be found @
 * https://www.interviewbit.com/problems/pascal-triangle-rows/
 */
package interviewbit.arrays;

import java.util.ArrayList;

public class KthRowPascalTriangle {

  public ArrayList<Integer> getRow(int a) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < a + 1; i++) {
      result.add(1);
    }
    for (int i = 1; i < a; i++) {
      int prev = 1;
      for (int j = 1; j <= i; j++) {
        int temp = result.get(j);
        result.set(j, prev + result.get(j));
        prev = temp;
      }
    }
    return result;
  }
}
