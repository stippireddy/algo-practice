package geeksForGeeks.arrays;
/**
 * This geeksforgeeks problem can be accessed at
 * http://www.geeksforgeeks.org/merge-one-array-of-size-n-into-another-one-of-size-mn/
 *
 * <p>Problem Statement:There are two sorted arrays. First one is of size m+n containing only m
 * elements. Another one is of size n and contains n elements. Merge these two arrays into the first
 * array of size m+n such that the output is sorted.
 *
 * <p>inputs : int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20}; int N[] = {5, 7, 9, 25};
 *
 * <p>output: mPlusN[] = {2, 5, 7, 8, 9, 13, 15, 20, 25}
 */
public class Arrays009 {
  public void mergeArrays(int[] a, int[] b) {
    int j = a.length - 1;
    for (int i = a.length - 1; i >= 0; i--) {
      if (a[i] != -1) {
        a[j] = a[i];
        j--;
      }
    }
    int i = j + 1;
    int k = 0;
    int index = 0;
    while (i < a.length && k < b.length) {
      if (a[i] <= b[k]) {
        a[index++] = a[i++];
      } else {
        a[index++] = b[k++];
      }
    }
    while (i < a.length) {
      a[index++] = a[i++];
    }
    while (k < b.length) {
      a[index++] = b[k++];
    }
  }
}
