package geeksForGeeks.arrays;

import java.util.HashMap;

/**
 * @author Sarveswara Tippireddy
 * <p>This GeeksforGeeks problem can be found @
 * http://www.geeksforgeeks.org/find-subarray-with-given-sum/
 */
public class Arrays055 {

  // Only handles positive numbers in the input
  // returns the indices with the 1st element counted as index 1
  public int[] findSubArrayWithGivenSumPositive(int[] input, int x) {
    int[] result = new int[]{-1, -1};
    int i = 0, j = 0;
    int sum = 0;
    while (j < input.length) {
      while (sum < x && j < input.length) {
        sum += input[j];
        j++;
      }
      while (sum > x && i < j) {
        sum -= input[i];
        i++;
      }
      if (sum == x) {
        result[0] = i + 1;
        result[1] = j;
        break;
      }
    }
    return result;
  }
  // Handles negative numbers in the input as well as x

  public int[] findSubArrayWithGivenSumNegative(int[] input, int x) {
    int[] result = new int[]{-1, -1};
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0;
    map.put(sum, -1);
    for (int i = 0; i < input.length; i++) {
      sum += input[i];
      if (map.containsKey(sum - x)) {
        result[0] = map.get(sum - x) + 2;
        result[1] = i + 1;
        break;
      }
      map.put(sum, i);
    }
    return result;
  }
}
