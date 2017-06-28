package geeksForGeeks.arrays;

public class Arrays127 {
  public void modify(int[] a) {
    if (a.length < 2) {
      return;
    }
    int prev = 1;
    for (int i = 0; i < a.length - 1; i++) {
      int curr = a[i];
      a[i] = prev * a[i + 1];
      prev = curr;
    }
    a[a.length - 1] *= prev;
  }
}
