/**
 * Created by Sarveswara Tippireddy on Sep 4, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/queue-reconstruction-by-height/description/
 */
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode406 {

  public int[][] reconstructQueueMyIntuitiveSolution(int[][] people) {
    if (people.length < 2) {
      return people;
    }
    Arrays.sort(people, (a, b) -> (a[0] - b[0]));
    int n = people.length;
    int[][] result = new int[people.length][2];
    for (int[] i : result) {
      Arrays.fill(i, -1);
    }
    for (int i = 0; i < n; i++) {
      int position = people[i][1];
      int j = 0;
      while (j < n && position > 0) {
        if (result[j][0] == -1 || result[j][0] >= people[i][0]) {
          position--;
        }
        j++;
      }
      while (j < n && result[j][0] != -1) {
        j++;
      }
      result[j] = people[i];
    }
    return result;
  }

  // Solution idea taken from
  // https://discuss.leetcode.com/topic/60394/easy-concept-with-python-c-java-solution
  public int[][] reconstructQueueCleverUseOfList(int[][] people) {
    Arrays.sort(people, (a, b) -> a[0] - b[0] == 0 ? a[1] - b[1] : b[0] - a[0]);
    ArrayList<int[]> result = new ArrayList<>();
    for (int[] i : people) {
      result.add(i[1], i);
    }
    return result.toArray(new int[result.size()][2]);
  }
}
