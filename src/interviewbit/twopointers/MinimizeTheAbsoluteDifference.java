/**
 * Created by Sarveswara Tippireddy on Jul 4, 2017
 *
 * <p>This InterviewBit problem can be found @
 * https://www.interviewbit.com/problems/minimize-the-absolute-difference/
 */
package interviewbit.twopointers;

import java.util.ArrayList;
//A : [ 1, 4, 5, 8, 10 ]
//B : [ 6, 9, 15 ]
//C : [ 2, 3, 6, 6 ]
public class MinimizeTheAbsoluteDifference {
  public int solve(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
    int i = 0, j = 0, k = 0;
    int prevA = a.get(i), prevB = b.get(j), prevC = c.get(k);
    int localMin = Integer.min(Integer.min(prevA, prevB), prevC);
    int localMax = Integer.max(Integer.max(prevA, prevB), prevC);
    int min = Math.abs(localMin - localMax);
    while (i < a.size() - 1 && j < b.size() - 1 && k < c.size() - 1) {
      if (i < a.size() - 1 && a.get(i) == localMin) {
        i++;
        prevA = a.get(i);
      } else if (j < b.size() - 1 && b.get(j) == localMin) {
        j++;
        prevB = b.get(j);
      } else if (k < c.size() - 1 && c.get(k) == localMin) {
        k++;
        prevC = c.get(k);
      }
      localMin = Integer.min(Integer.min(prevA, prevB), prevC);
      localMax = Integer.max(Integer.max(prevA, prevB), prevC);
      min = Integer.min(Math.abs(localMin - localMax), min);
      if (min == 0) {
        break;
      }
    }
    return min;
  }
}
