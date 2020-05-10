package geeksForGeeks.arrays;

/**
 * @author Sarveswara Tippireddy
 * <p>This GeeksforGeeks problem can be found @
 * http://www.geeksforgeeks.org/move-zeroes-end-array/
 */
public class Arrays102 {

  public static void moveZeroes(int[] a) {
    int i = 0, j = 1;
    while (j < a.length) {
      if (a[i] == 0) {
        while (j < a.length && a[j] == 0) {
          j++;
        }
        if (j < a.length) {
          a[i] = a[j];
          a[j] = 0;
        }
      }
      i++;
      j++;
    }
  }
}
