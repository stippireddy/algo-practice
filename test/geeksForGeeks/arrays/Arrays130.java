package geeksForGeeks.arrays;

public class Arrays130 {

  public int findLargestPairSum(int[] a) {
    int firstHighest = Integer.MIN_VALUE;
    int secondHighest = Integer.MIN_VALUE;
    for (int i : a) {
      if (i > secondHighest) {
        secondHighest = i;
        if (secondHighest > firstHighest) {
          int temp = firstHighest;
          firstHighest = secondHighest;
          secondHighest = temp;
        }
      }
    }
    return secondHighest + firstHighest;
  }
}
