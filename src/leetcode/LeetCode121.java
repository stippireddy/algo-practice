/**
 * Created by Sarveswara Tippireddy on Jul 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/description
 */
package leetcode;

public class LeetCode121 {

  public int maxProfit(int[] prices) {
    if (prices.length < 2) {
      return 0;
    }
    int maxProfit = 0;
    int minPrice = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      } else {
        maxProfit = Integer.max(maxProfit, prices[i] - minPrice);
      }
    }
    return maxProfit;
  }
}
