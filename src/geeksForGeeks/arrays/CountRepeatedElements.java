package geeksForGeeks.arrays;

public class CountRepeatedElements {
  public int[] findCount(int[] a) {
    int[] result = new int[2];
    int low = a[0], high = a[a.length - 1];
    result[1] = a.length - (high - low);
    int i = 0, j = a.length - 1;
    while (i < j) {
      int mid = i + j >>> 1;
      if (a[mid] == low + mid) {
        i = mid + 1;
        low = a[mid + 1];
      } else {
        j = mid - 1;
        high = a[mid - 1];
      }
    }
    result[0] = low;
    return result;
  }
}
