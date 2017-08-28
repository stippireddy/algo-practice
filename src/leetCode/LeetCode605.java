/**
 * Created by Sarveswara Tippireddy on Aug 28, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/can-place-flowers/description/
 */
package leetCode;

public class LeetCode605 {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 1) {
        continue;
      }
      if ((i == 0 || flowerbed[i - 1] == 0)
          && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
        flowerbed[i] = 1;
        // This can be done because once a plot is planted, the one by its side can't be planted
        i++;
        n--;
      }
    }
    return n <= 0;
  }
}
