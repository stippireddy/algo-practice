package leetCode;

public class LeetCode1547 {

  public int minCost(int n, int[] cuts) {
    return helper(0, n, cuts, 0, cuts.length - 1);
  }

  private int helper(int start, int end, int[] cuts, int left, int right) {
    if (left > right) {
      return 0;
    }
    int cost = end - start;
    int min = Integer.MAX_VALUE;
    for (int i = left; i <= right; i++) {
      min = Integer
          .min(min,
              helper(start, cuts[i], cuts, left, i - 1) + helper(cuts[i], end, cuts, i + 1, right));
    }
    return cost + min;
  }
}
