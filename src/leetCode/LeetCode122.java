/**
 * Created by Sarveswara Tippireddy on Jul 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/#/description
 */
package leetCode;

public class LeetCode122 {
  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int currMin = Integer.MAX_VALUE;
    int i = 0;
    while (i < prices.length) {
      if (prices[i] < currMin) {
        currMin = prices[i];
      }
      while (i < prices.length - 1 && prices[i] < prices[i + 1]) {
        i++;
      }
      maxProfit += prices[i] - currMin;
      currMin = prices[i];
      i++;
    }
    return maxProfit;
  }
}
