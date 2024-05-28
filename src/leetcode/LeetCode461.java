package leetcode;

public class LeetCode461 {

  public int hammingDistance(int x, int y) {
    int n = x ^ y;
    int count = 0;
    while (n > 0) {
      n = n & (n - 1);
      count++;
    }
    return count;
  }
}
