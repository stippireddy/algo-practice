/**
 * Created by Sarveswara Tippireddy on Jul 4, 2017
 *
 * <p>This InterviewBit problem can be found @
 * https://www.interviewbit.com/problems/first-missing-integer/
 */
package interviewbit.arrays;

import java.util.ArrayList;

public class FirstMissingNumber {

  public int firstMissingPositive(ArrayList<Integer> a) {
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) < 1) {
        a.set(i, a.size() + 1);
      }
    }
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) != 0) {
        int j = a.get(i);
        while (j != 0 && (j - 1) < a.size()) {
          int temp = a.get(j - 1);
          a.set(j - 1, 0);
          j = temp;
        }
      }
    }
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) != 0) {
        return i + 1;
      }
    }
    return a.size() + 1;
  }
}
