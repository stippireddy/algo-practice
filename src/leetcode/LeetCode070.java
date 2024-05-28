package leetcode;

public class LeetCode070 {

  public int climbStairs(int n) {
    int a = 1;
    int b = 2;
    for (int i = 3; i <= n; i++) {
      int temp = a + b;
      a = b;
      b = temp;
    }
    return b;
  }
}
