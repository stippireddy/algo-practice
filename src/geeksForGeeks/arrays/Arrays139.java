package geeksForGeeks.arrays;
/**
 * @author Sarveswara Tippireddy
 *     <p>This GeeksforGeeks problem can be found @
 *     http://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/
 */
public class Arrays139 {
  public void convert(int[] input) {
    boolean isLessThan = true;
    for (int i = 0; i < input.length - 1; i++) {
      if (isLessThan) {
        if (input[i] > input[i + 1]) {
          int temp = input[i + 1];
          input[i + 1] = input[i];
          input[i] = temp;
        }
        isLessThan = false;
      } else {
        if (input[i] < input[i + 1]) {
          int temp = input[i + 1];
          input[i + 1] = input[i];
          input[i] = temp;
        }
        isLessThan = true;
      }
    }
  }
}
