/**
 * Created by Sarveswara Tippireddy on Jul 5, 2017
 *
 * <p>This InterviewBit problem can be found @ link
 */
package interviewbit.arrays;

import java.util.ArrayList;

public class MaximumUnsortedSubarray {

  /**
   * Failed Attempt1
   */

  //  public ArrayList<Integer> subUnsort(ArrayList<Integer> a) {
  //    ArrayList<Integer> result = new ArrayList<>();
  //    int minUnsorted = -1;
  //    int nextMinUnsorted = -1;
  //    int maxUnsorted = -1;
  //    //3, 3, 4, 5, 5, 9, 11, 13, 14, 15, 15, 16, 15, 20, 16
  //    for (int i = 0; i < a.size() - 1; i++) {
  //      if (a.get(i) > a.get(i + 1)) {
  //        if (minUnsorted == -1 || a.get(i + 1) <= a.get(minUnsorted)) {
  //          minUnsorted = i + 1;
  //        }
  //        maxUnsorted = i + 1;
  //      } else if (minUnsorted != -1 && a.get(i) <= a.get(minUnsorted)) {
  //        minUnsorted = i;
  //        maxUnsorted = i;
  //      }
  //    }
  //    for (int i = 0; i < maxUnsorted; i++) {
  //      if (a.get(i) > a.get(minUnsorted)) {
  //        nextMinUnsorted = i;
  //        break;
  //      }
  //    }
  //    if (minUnsorted != -1) {
  //      result.add(nextMinUnsorted);
  //      result.add(maxUnsorted);
  //    } else {
  //      result.add(-1);
  //    }
  //
  //    return result;
  //  }
  public ArrayList<Integer> subUnsort(ArrayList<Integer> a) {
    ArrayList<Integer> result = new ArrayList<>();

    return result;
  }
}
