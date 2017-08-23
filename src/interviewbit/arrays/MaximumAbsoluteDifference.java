/**
 * Created by Sarveswara Tippireddy on Jul 2, 2017
 *
 * <p>This GeeksForGeeks problem can be found @ link
 */
package interviewbit.arrays;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

  // My solution
  // Iterates over the array while maintaining the max and min
  // encountered previously until i-1. The max and min calculation
  // is the tricky part as we have to consider the distance from
  // previous maximum/minimum stored to the current element being
  // compared.
  public int maxArr0(ArrayList<Integer> a) {
    int[] result = new int[a.size()];
    result[0] = 0;
    int prevMin = a.get(0);
    int prevMinIndex = 0;
    int prevMax = a.get(0);
    int prevMaxIndex = 0;
    for (int i = 1; i < result.length; i++) {
      result[i] =
          Integer.max(
              Math.abs(prevMax - a.get(i)) + Math.abs(prevMaxIndex - i),
              Math.abs(prevMin - a.get(i)) + Math.abs(prevMinIndex - i));
      if (!(prevMax + i - prevMaxIndex >= a.get(i))) {
        if (prevMax < a.get(i)) {
          prevMax = a.get(i);
          prevMaxIndex = i;
        }
      }
      if (!(prevMin - (i - prevMinIndex) <= a.get(i))) {
        if (prevMin > a.get(i)) {
          prevMin = a.get(i);
          prevMinIndex = i;
        }
      }
    }
    int max = -1;
    for (int i : result) {
      max = Integer.max(max, i);
    }
    return max;
  }

  // Editorial solution
  // f(i, j) = |A[i] - A[j]| + |i - j| can be written in 4 ways
  // (Since we are looking at max value, we don’t even care if
  // the value becomes negative as long as we are also covering
  // the max value in some way).

  // (A[i] + i) - (A[j] + j)
  // -(A[i] - i) + (A[j] - j)
  // (A[i] - i) - (A[j] - j)
  // (-A[i] - i) + (A[j] + j) = -(A[i] + i) + (A[j] + j)

  // Note that case 1 and 4 are equivalent and so are case 2 and 3.

  // We can construct two arrays with values: A[i] + i and A[i] - i.
  // Then, for above 2 cases, we find the maximum value possible.
  // For that, we just have to store minimum and maximum values of
  // expressions A[i] + i and A[i] - i for all i.
  public int maxArr1(ArrayList<Integer> a) {
    int[] aofiplusi = new int[a.size()];
    int[] aofiminusi = new int[a.size()];
    for (int i = 0; i < aofiminusi.length; i++) {
      aofiminusi[i] = a.get(i) - i;
      aofiplusi[i] = a.get(i) + i;
    }
    int plusMax = 0;
    int prevMin = aofiplusi[0];
    int prevMax = aofiplusi[0];
    for (int i = 1; i < aofiplusi.length; i++) {
      int curr = Integer.max(Math.abs(aofiplusi[i] - prevMax), Math.abs(aofiplusi[i] - prevMin));
      plusMax = Integer.max(plusMax, curr);
      prevMin = Integer.min(prevMin, aofiplusi[i]);
      prevMax = Integer.max(prevMax, aofiplusi[i]);
    }
    int minusMax = 0;
    prevMin = aofiminusi[0];
    prevMax = aofiminusi[0];
    for (int i = 1; i < aofiminusi.length; i++) {
      int curr = Integer.max(Math.abs(aofiminusi[i] - prevMax), Math.abs(aofiminusi[i] - prevMin));
      minusMax = Integer.max(minusMax, curr);
      prevMin = Integer.min(prevMin, aofiminusi[i]);
      prevMax = Integer.max(prevMax, aofiminusi[i]);
    }
    return Integer.max(plusMax, minusMax);
  }
}
