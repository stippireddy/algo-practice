/**
 * Created by Sarveswara Tippireddy on Aug 2, 2017
 *
 * <p>This LeetCode problem can be found @
 * https://leetcode.com/problems/majority-element/description/
 */
package leetCode;

public class LeetCode169 {

  public int majorityElementBoyerMooreAlgorithm(int[] nums) {
    int k = nums[0];
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (count == 0) {
        k = nums[i];
        count++;
        continue;
      }
      if (nums[i] == k) {
        count++;
      } else {
        count--;
      }
    }
    count = 0;
    for (int i : nums) {
      if (k == i) {
        count++;
      }
    }
    if (count > (nums.length / 2)) {
      return k;
    }
    return -1;
  }
  
  public int majorityElementBitMagic(int[] nums) {
    int result = 0;
    int n = 1;
    for (int i = 0; i < 32; i++) {
      int count = 0;
      for (int num : nums) {
        if ((num & n) != 0) {
          count++;
        }
      }
      if(count>nums.length/2){
        result = result | n;
      }
      n = n << 1;
    }
    return result;
  }
  
  public static void main(String[] args) {
    new LeetCode169().majorityElementBitMagic(new int[] {4, 5, 4});
  }
}
