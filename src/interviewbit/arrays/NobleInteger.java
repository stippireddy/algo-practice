/**
 * Created by Sarveswara Tippireddy on Jul 3, 2017
 *
 * <p>This InterviewBit problem can be found @ https://www.interviewbit.com/problems/noble-integer/
 */
package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {

  public int solve(ArrayList<Integer> a) {
    Collections.sort(a);
    for (int i = 0; i < a.size() - 1; i++) {
      if (a.get(i) != a.get(i + 1)) {
        if ((a.size() - i - 1) == a.get(i)) {
          return 1;
        }
      }
    }
    if (a.get(a.size() - 1) == 0) {
      return 1;
    }
    return -1;
  }
}
