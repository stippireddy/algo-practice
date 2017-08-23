/**
 * Created by Sarveswara Tippireddy on Jul 2, 2017
 *
 * <p>This InterviewBit problem can be found @ https://www.interviewbit.com/problems/largest-number/
 */
package interviewbit.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
  public String largestNumber(final List<Integer> a) {
    Collections.sort(a, new IntegerComparator());
    StringBuffer sb = new StringBuffer();
    for (int s : a) {
      sb.append(s);
    }
    if (sb.charAt(0) == '0') {
      return "0";
    }
    return sb.toString();
  }
}

class IntegerComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer o1, Integer o2) {
    int temp = ("" + o2 + o1).compareTo("" + o1 + o2);
    if (temp > 0) return 1;
    else if (temp < 0) return -1;
    else return 0;
  }
}
