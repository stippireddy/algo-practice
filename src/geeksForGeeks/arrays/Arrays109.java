package geeksForGeeks.arrays;

import java.util.Arrays;

/**
 * @author Sarveswara Tippireddy
 * <p>This GeeksforGeeks problem can be found @
 * http://www.geeksforgeeks.org/sort-array-wave-form-2/
 */
public class Arrays109 {

  public void convertBySorting(int[] input) {
    Arrays.sort(input);
    for (int i = 0; i < input.length - 1; i += 2) {
      int temp = input[i + 1];
      input[i + 1] = input[i];
      input[i] = temp;
    }
  }

  public void convertInLinear(int[] input) {
    if (input.length < 2) {
      return;
    }
    boolean isGreaterThan = true;
    for (int i = 0; i < input.length - 1; i++) {
      if (isGreaterThan) {
        if (input[i] < input[i + 1]) {
          swap(input, i, i + 1);
        }
        isGreaterThan = false;
      } else {
        if (input[i] > input[i + 1]) {
          swap(input, i, i + 1);
        }
        isGreaterThan = true;
      }
    }
  }

  private void swap(int[] input, int i, int j) {
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }
}
