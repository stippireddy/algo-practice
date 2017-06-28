package leetCode;

public class LeetCode624 {
  public static int maxDistance(int[][] arrays) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arrays.length; i++) {
      if (min > arrays[i][0]) {
        min = arrays[i][0];
      }
      if (max < arrays[i][arrays[i].length - 1]) {
        max = arrays[i][arrays[i].length - 1];
      }
    }
    return Math.abs(max - min);
  }

  public static void main(String[] args) {
    maxDistance(new int[][] {{1, 4}, {0, 5}});
  }
}
