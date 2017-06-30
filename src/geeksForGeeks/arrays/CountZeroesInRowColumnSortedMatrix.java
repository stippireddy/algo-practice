/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/count-zeros-in-a-row-wise-and-column-wise-sorted-matrix/
 */
package geeksForGeeks.arrays;

public class CountZeroesInRowColumnSortedMatrix {
  public int countZeros(int a[][], int n) {
    int count = 0;
    int[] firstRow = a[0];
    for (int i = 0; i < n && firstRow[i] == 0; i++) {
      count++;
    }
    int highestColumnIndex = count - 1;
    for (int i = 1; i < n; i++) {
      int j = highestColumnIndex;
      while (j >= 0 && a[i][j] == 1) {
        j--;
      }
      highestColumnIndex = j;
      count += j + 1;
    }
    return count;
  }
}
