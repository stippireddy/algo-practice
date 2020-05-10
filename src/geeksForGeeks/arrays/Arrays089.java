/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/find-the-maximum-repeating-number-in-ok-time/
 */
package geeksForGeeks.arrays;

public class Arrays089 {

  public int getMaxRepeatingNumUsingModifyingArray(int[] a, int k) {
    for (int i : a) {
      a[i % k] += k;
    }
    int maxRepeatingElement = k;
    int maxCount = 0;
    for (int i = 0; i < a.length; i++) {
      int count = a[i] / k;
      if (count > maxCount) {
        maxCount = count;
        maxRepeatingElement = i;
      }
    }
    return maxRepeatingElement;
  }

  public int getMaxRepeatingNumUsingCountArray(int[] a, int k) {
    int[] countArray = new int[k];
    for (int i : a) {
      countArray[i]++;
    }
    int maxCount = 0;
    int maxRepeatingElement = k;
    for (int i = k - 1; i >= 0; i--) {
      if (maxCount <= countArray[i]) {
        maxCount = countArray[i];
        if (i < maxRepeatingElement) {
          maxRepeatingElement = i;
        }
      }
    }
    return maxRepeatingElement;
  }
}
