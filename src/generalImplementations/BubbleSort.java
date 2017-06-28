package generalImplementations;

public class BubbleSort {
  public static void sort(int[] a) {
    for (int i = a.length - 1; i > 0; i--) {
      boolean swap = false;
      for (int j = 0; j < i; j++) {
        if (a[j] > a[j + 1]) {
          swap = true;
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
      if (!swap) {
        break;
      }
    }
  }
  /**
   * Recursive Bubble Sort has no performance/implementation advantages, but can be a good question
   * to check one’s understanding of Bubble Sort and recursion.
   */
  public static void sortRecursive(int[] a) {
    helper(a, a.length - 1);
  }

  private static void helper(int[] a, int length) {
    if (length < 1) {
      return;
    }
    for (int i = 0; i < length; i++) {
      if (a[i] > a[i + 1]) {
        int temp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = temp;
      }
    }
    helper(a, length - 1);
  }
}
