/**
 * Created by Sarveswara Tippireddy on Jul 5, 2017
 *
 * <p>This InterviewBit problem can be found @
 * https://www.interviewbit.com/problems/count-element-occurence/
 */
package interviewbit.binarySearch;

import java.util.List;

public class CountElementOccurence {
  public int findCount(final List<Integer> a, int b) {
    int left = 0;
    int right = a.size() - 1;
    int leftIndex = -1;
    while (left <= right) {
      if (left == right) {
        if (a.get(left) == b) {
          leftIndex = left;
          break;
        } else {
          return 0;
        }
      }
      int mid = left + (right - left) / 2;
      if (a.get(mid) == b) {
        if (mid == left || a.get(mid - 1) < b) {
          leftIndex = mid;
          break;
        } else {
          right = mid - 1;
        }
      } else if (a.get(mid) > b) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    left = 0;
    right = a.size() - 1;
    int rightIndex = -1;
    while (left <= right) {
      if (left == right) {
        if (a.get(left) == b) {
          rightIndex = left;
          break;
        } else {
          return 0;
        }
      }
      int mid = left + (right - left) / 2;
      if (a.get(mid) == b) {
        if (mid == right || a.get(mid + 1) > b) {
          rightIndex = mid;
          break;
        } else {
          left = mid + 1;
        }
      } else if (a.get(mid) > b) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    if (leftIndex == -1) return 0;
    return rightIndex - leftIndex + 1;
  }
}
