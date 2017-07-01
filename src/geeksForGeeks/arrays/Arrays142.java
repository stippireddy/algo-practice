/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/reorder-a-array-according-to-given-indexes/
 */
package geeksForGeeks.arrays;

public class Arrays142 {
  public void reOrder(int[] a, int[] indices) {
    for (int i = 0; i < indices.length; i++) {
      while (indices[i] != i) {
        int tempA = a[indices[i]];
        int tempIndex = indices[indices[i]];
        indices[indices[i]] = indices[i];
        a[indices[i]] = a[i];
        indices[i] = tempIndex;
        a[i] = tempA;
      }
    }
  }
}
