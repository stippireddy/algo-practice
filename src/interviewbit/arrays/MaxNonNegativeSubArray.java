/**
 * Created by Sarveswara Tippireddy on Jul 2, 2017
 *
 * <p>This InterviewBit problem can be found @ link
 */
package interviewbit.arrays;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {

  public ArrayList<Integer> maxset(ArrayList<Integer> a) {
    ArrayList<Integer> result = new ArrayList<>();
    int maxLeftIndex = 0;
    while (maxLeftIndex < a.size() && a.get(maxLeftIndex) < 0) {
      maxLeftIndex++;
    }
    int currLeftIndex = maxLeftIndex;
    int maxLength = 0;
    int currLength = 0;
    long currSum = 0;
    long maxSum = 0;
    int i = maxLeftIndex;
    while (i < a.size()) {
      while (i < a.size() && a.get(i) >= 0) {
        currLength++;
        currSum += a.get(i);
        i++;
      }
      if (currSum > maxSum) {
        maxSum = currSum;
        maxLeftIndex = currLeftIndex;
        maxLength = currLength;
      } else if (currSum == maxSum) {
        if (currLength > maxLength) {
          maxLength = currLength;
          maxLeftIndex = currLeftIndex;
        } else if (currLength == maxLength) {
          maxLeftIndex = Integer.min(maxLeftIndex, currLeftIndex);
        }
      }
      while (i < a.size() && a.get(i) < 0) {
        i++;
      }
      currLeftIndex = i;
      currSum = 0;
      currLength = 0;
    }
    while (maxLeftIndex < a.size() && a.get(maxLeftIndex) >= 0) {
      result.add(a.get(maxLeftIndex));
      maxLeftIndex++;
    }
    return result;
  }
}
