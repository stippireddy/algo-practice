/**
 * Created by Sarveswara Tippireddy on Aug 28, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/teemo-attacking/description/
 */
package leetCode;

public class LeetCode495 {
  public int findPoisonedDuration(int[] timeSeries, int duration) {
    if (timeSeries.length == 0) {
      return 0;
    }
    int totalPoisonedTime = duration;
    int timeWhenPoisonEnds = timeSeries[0] + duration - 1;
    for (int i = 1; i < timeSeries.length; i++) {
      if (timeSeries[i] > timeWhenPoisonEnds) {
        totalPoisonedTime += duration;
        timeWhenPoisonEnds = timeSeries[i] + duration - 1;
      } else {
        if (timeSeries[i] + duration - 1 > timeWhenPoisonEnds) {
          totalPoisonedTime += timeSeries[i] + duration - 1 - timeWhenPoisonEnds;
          timeWhenPoisonEnds = timeSeries[i] + duration - 1;
        }
      }
    }
    return totalPoisonedTime;
  }
}
