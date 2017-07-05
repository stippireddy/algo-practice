package geeksForGeeks.dynamicProgramming;

/**
 * @author Sarveswara Tippireddy
 *     <p>This GeeksforGeeks problem can be found @
 *     http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class Basics04 {
  public int findMaxContiguousSumKadane(int[] a) {
    int maxSum = 0;
    int maxEndingHere = 0;
    int maxNum = Integer.MIN_VALUE;
    for (int i : a) {
      maxEndingHere += i;
      if (maxEndingHere < 0) {
        maxEndingHere = 0;
      } else {
        if (maxEndingHere > maxSum) {
          maxSum = maxEndingHere;
        }
      }
      if (i > maxNum) {
        maxNum = i;
      }
    }
    if (maxNum < 0) {
      return maxNum;
    }
    return maxSum;
  }
}
