package geeksForGeeks.arrays;

/**
 * @author Sarveswara Tippireddy
 *     <p>This GeeksforGeeks problem can be found @
 *     http://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/
 */
public class Arrays106 {
  public int minLengthSubArray(int[] input, int x) {
    int i = 0, j = 0;
    int minLength = input.length + 1;
    int sum = 0;
    while (j < input.length) {
      while (sum <= x && j < input.length) {
        // The following block is added to eliminate negative sum
        // subarrays if x is positive
        if (sum <= 0 & x > 0) {
          sum = 0;
          i = j;
        }
        sum = sum + input[j];
        j++;
      }
      while (sum > x && i < j) {
        minLength = Integer.min(j - i, minLength);
        if (input[i] > 0) {
          sum = sum - input[i];
        } else {
          sum = sum + input[i];
        }
        i++;
      }
    }
    // The following block is added to ensure that all the
    // subarrays are checked even in case of negative numbers
    while (i < input.length) {
      sum = sum - input[i];
      i++;
      if (sum > x) {
        minLength = Integer.min(j - i, minLength);
      }
    }
    return minLength;
  }
}
