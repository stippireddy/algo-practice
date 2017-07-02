/**
 * Created by Sarveswara Tippireddy on Jul 2, 2017
 *
 * <p>This LeetCode problem can be found @
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/description
 */
package leetCode;

public class LeetCode121 {
  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    if (prices.length < 2) {
      return maxProfit;
    }
    int maxRight = prices[prices.length - 1];
    for (int i = prices.length - 2; i >= 0; i--) {
      int currProfit = maxRight - prices[i];
      if (maxProfit < currProfit) {
        maxProfit = currProfit;
      }
      if (prices[i] > maxRight) {
        maxRight = prices[i];
      }
    }
    return maxProfit;
  }
}
