/**
 * Created by Sarveswara Tippireddy on Sep 1, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/product-of-array-except-self/description/
 */
package leetcode;

public class LeetCode238 {

  public int[] productExceptSelf1(int[] nums) {
    int product = 1;
    int numberOfZeroes = 0;
    int onlyZeroIndex = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        product *= nums[i];
      } else {
        onlyZeroIndex = i;
        numberOfZeroes++;
      }
    }
    int[] result = new int[nums.length];
    if (numberOfZeroes == 1) {
      result[onlyZeroIndex] = product;
      return result;
    } else if (numberOfZeroes == 0) {
      for (int i = 0; i < result.length; i++) {
        result[i] = product / nums[i];
      }
    }
    return result;
  }

  public int[] productExceptSelf2(int[] nums) {
    int[] result = new int[nums.length];
    result[result.length - 1] = 1;
    for (int i = result.length - 2; i >= 0; i--) {
      result[i] = result[i + 1] * nums[i + 1];
    }
    int leftProduct = nums[0];
    for (int i = 1; i < result.length; i++) {
      result[i] = leftProduct * result[i];
      leftProduct *= nums[i];
    }
    return result;
  }

  public int[] productExceptSelf3(int[] nums) {
    multiply(nums, 1, 0);
    return nums;
  }

  public int multiply(int[] a, int fwdProduct, int indx) {
    int revProduct = 1;
    if (indx < a.length) {
      revProduct = multiply(a, fwdProduct * a[indx], indx + 1);
      int cur = a[indx];
      a[indx] = fwdProduct * revProduct;
      revProduct *= cur;
    }
    return revProduct;
  }
}
