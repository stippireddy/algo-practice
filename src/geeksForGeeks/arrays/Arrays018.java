package geeksForGeeks.arrays;

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
}
