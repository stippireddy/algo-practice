package geeksForGeeks.arrays;

public class Arrays023 {
  public void segregateZeroesOnes(int[] input) {
    int i = 0, j = input.length - 1;
    while (i < j) {
      if (input[i] == 0) {
        i++;
      } else if (input[j] == 1) {
        j--;
      } else {
        input[i] = 0;
        input[j] = 1;
        i++;
        j--;
      }
    }
  }
}
