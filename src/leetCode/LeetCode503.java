package leetCode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Sarveswara Tippireddy on 5/19/2017.
 */
public class LeetCode503 {
    public int[] nextGreaterElements(int[] nums) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] output = new int[nums.length];
        Arrays.fill(output, -1);
        int n = nums.length;
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                output[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return output;
    }
}
