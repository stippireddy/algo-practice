package geeksForGeeks.arrays;

/**
 * @author Sarveswara Tippireddy
 * <p>This GeeksforGeeks problem can be found @
 * http://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 */
public class Arrays031 {

  public void sort(int[] input) {
    int low = 0, mid = 0, high = input.length - 1;
    while (mid <= high) {
      if (input[mid] == 0) {
        swap(input, low, mid);
        low++;
        mid++;
      } else if (input[mid] == 2) {
        swap(input, mid, high);
        high--;
      } else {
        mid++;
      }
    }
  }

  private void swap(int[] input, int a, int b) {
    int temp = input[a];
    input[a] = input[b];
    input[b] = temp;
  }
}
