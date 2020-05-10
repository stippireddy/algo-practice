package geeksForGeeks.arrays;

/**
 * @author Sarveswara Tippireddy
 * <p>This GeeksforGeeks problem can be found @
 * http://www.geeksforgeeks.org/counting-inversions/
 */
public class Arrays018 {

  public static int countInversionsNaive(int[] input) {
    int count = 0;
    for (int i = 0; i < input.length - 1; i++) {
      for (int j = i + 1; j < input.length; j++) {
        if (input[i] > input[j]) {
          count++;
        }
      }
    }
    return count;
  }
  //TODO Add more efficient ways to count inversions.
}
