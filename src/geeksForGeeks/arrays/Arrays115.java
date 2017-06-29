package geeksForGeeks.arrays;

/**
 * @author Sarveswara Tippireddy
 *     <p>This GeeksforGeeks problem can be found @
 *     http://www.geeksforgeeks.org/given-sorted-array-number-x-find-pair-array-whose-sum-closest-x/
 */
public class Arrays115 {
  public int[] findClosestPair(int[] a, int x) {
    int i = 0, j = a.length - 1;
    int minDiff = Integer.MAX_VALUE;
    int[] result = new int[] {-1, -1};
    while (i < j) {
      int diff = Math.abs(a[j] + a[i] - x);
      if (diff < minDiff) {
        minDiff = diff;
        result[0] = a[i];
        result[1] = a[j];
      }
      if (a[i] + a[j] < x) {
        i++;
      } else if (a[i] + a[j] > x) {
        j--;
      } else {
        break;
      }
    }
    return result;
  }
}
