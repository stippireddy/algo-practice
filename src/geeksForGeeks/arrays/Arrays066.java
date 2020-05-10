package geeksForGeeks.arrays;

/**
 * @author Sarveswara Tippireddy
 * <p>This GeeksforGeeks problem can be found @
 * http://www.geeksforgeeks.org/maximum-product-subarray/
 */
public class Arrays066 {
  // This beautiful piece of code is attributed to the user
  // @mzchen on leetcode.

  public static int findMaxProductSubarray1(int[] a) {
    int maxProductEndingHere = a[0];
    int minProductEndingHere = a[0];
    int maxProduct = a[0];
    for (int i = 1; i < a.length; i++) {
      int temp = maximum(maxProductEndingHere * a[i], minProductEndingHere * a[i], a[i]);
      minProductEndingHere =
          minimum(maxProductEndingHere * a[i], minProductEndingHere * a[i], a[i]);
      maxProductEndingHere = temp;
      maxProduct = Integer.max(maxProduct, maxProductEndingHere);
    }
    return maxProduct;
  }

  private static int minimum(int i, int j, int k) {
    if (i <= j) {
      if (j <= k || i <= k) {
        return i;
      } else {
        return k;
      }
    } else {
      if (i <= k || j <= k) {
        return j;
      } else {
        return k;
      }
    }
  }

  private static int maximum(int i, int j, int k) {
    if (i >= j) {
      if (j >= k || i >= k) {
        return i;
      } else {
        return k;
      }
    } else {
      if (i >= k || j >= k) {
        return j;
      } else {
        return k;
      }
    }
  }

  public int findMaxProductSubarray(int a[]) {
    // store the result that is the max we have found so far
    int r = a[0];

    // imax/imin stores the max/min product of
    // subarray that ends with the current number A[i]
    for (int i = 1, imax = r, imin = r; i < a.length; i++) {
      // multiplied by a negative makes the bigger number smaller
      // and the smaller number bigger so we redefine the
      // imax and imin by swapping them
      if (a[i] < 0) {
        int temp = imax;
        imax = imin;
        imin = temp;
      }

      // max/min product for the current number is either the
      // current number itself or the max/min by the previous
      // number times the current one
      imax = Integer.max(a[i], imax * a[i]);
      imin = Integer.min(a[i], imin * a[i]);

      // The newly computed max value is a candidate for our
      // global result
      r = Integer.max(r, imax);
    }
    return r;
  }
}
