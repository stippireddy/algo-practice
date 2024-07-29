package leetcode;

import java.util.*;

public class Leetcode398 {
    /*
        Explanation for reservoir sampling:
            nums = [1, 2, 3, 3, 3]
            pick(3)
            p(2) = 1 * 1/2 * 2/3 = 1/3
            p(3) = 1/2 * 2/3 = 2/3
            p(4) = 1/3
     */
    class Solution {

        private int[] nums;
        private Random r;

        public Solution(int[] nums) {
            this.nums = nums;
            r = new Random();
        }

        public int pick(int target) {
            int count = 0;
            int result = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != target) {
                    continue;
                }
                count++;
                if (r.nextInt(count) == 0) {
                    result = i;
                }
            }
            return result;
        }
    }
}
