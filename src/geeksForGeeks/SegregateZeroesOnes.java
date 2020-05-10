package geeksForGeeks;

import java.util.Arrays;

/*
 * This geeksforgeeks problem can be found @ http://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
 */
public class SegregateZeroesOnes {

  public static void segregate(int[] array) {
    int i = 0;
    int j = array.length - 1;
    while (i < j) {
      if (array[i] == 0) {
        i++;
      } else if (array[i] == 1) {
        while (j > i && array[j] == 1) {
          j--;
        }
        if (i >= j) {
          break;
        }
        array[j--] = 1;
        array[i++] = 0;
      }
    }
  }

  public static void main(String[] args) {
    int[] input1 = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
    segregate(input1);
    System.out.println(Arrays.toString(input1));
    int[] input2 = {0, 0, 0, 0, 0};
    segregate(input2);
    System.out.println(Arrays.toString(input2));
    int[] input3 = {1, 1, 1, 1, 1};
    segregate(input3);
    System.out.println(Arrays.toString(input3));
  }
}
