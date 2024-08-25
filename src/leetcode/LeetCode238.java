/**
 * Created by Sarveswara Tippireddy on Sep 1, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/product-of-array-except-self/description/
 */
package leetcode;

public class LeetCode238 {

    // Below solution uses extra space for left and right products
    public int[] productExceptSelfSuboptimal(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            left[i] = product;
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            product *= nums[i];
            right[i] = product;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int l = i == 0 ? 1 : left[i - 1];
            int r = i == nums.length - 1 ? 1 : right[i + 1];
            result[i] = l * r;
        }
        return result;
    }

    // Below solution uses just the output array space
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            result[i] = product;
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int l = i == 0 ? 1 : result[i - 1];
            result[i] = l * product;
            product *= nums[i];
        }
        return result;
    }
}
