package leetcode;

public class LeetCode1524 {

  public static int numOfSubarrays(int[] arr) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    int odd = 0;
    int even = 0;
    int totalCount = 0;
    for (int i : arr) {
      if (i % 2 == 0) {
        even += 1;
      } else {
        int temp = odd;
        odd = even + 1;
        even = temp;
      }
      totalCount += odd;
    }
    return totalCount;
  }
}
