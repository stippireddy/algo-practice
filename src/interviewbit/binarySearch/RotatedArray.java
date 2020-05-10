/**
 * Created by Sarveswara Tippireddy on Jul 5, 2017
 *
 * <p>This InterviewBit problem can be found @ https://www.interviewbit.com/problems/rotated-array/
 */
package interviewbit.binarySearch;

import java.util.List;

public class RotatedArray {

  public int findMin(final List<Integer> a) {
    int left = 0, right = a.size() - 1, n = a.size();
    while (left <= right) {
      if (a.get(left) <= a.get(right)) {
        return a.get(left);
      }
      int mid = left + (right - left) / 2;
      int prev = (mid + n - 1) % n, next = (mid + 1) % n;
      if (a.get(prev) > a.get(mid) && a.get(mid) < a.get(next)) {
        return a.get(mid);
      } else if (a.get(mid) >= a.get(left)) {
        left = mid + 1;
      } else if (a.get(mid) <= a.get(right)) {
        right = mid - 1;
      }
    }
    return -1;
  }
}
