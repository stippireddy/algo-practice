/**
 * Created by Sarveswara Tippireddy on Jul 5, 2017
 *
 * <p>This InterviewBit problem can be found @ https://www.interviewbit.com/problems/flip/
 */
package interviewbit.arrays;

import java.util.ArrayList;

public class Flip {
  public ArrayList<Integer> flip(String a) {
    ArrayList<Integer> res = new ArrayList<>();
    int maxFlips = 0;
    int start = 0;
    int end = 0;
    int s = 0;
    int sumEndingHere = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == '0') {
        sumEndingHere += 1;
        if (maxFlips < sumEndingHere) {
          maxFlips = sumEndingHere;
          start = s;
          end = i;
        }
      } else {
        sumEndingHere += (-1);
        if (sumEndingHere < 0) {
          sumEndingHere = 0;
          s = i + 1;
        }
      }
    }
    if (maxFlips > 0) {
      res.add(start + 1);
      res.add(end + 1);
    }
    return res;
  }
}
