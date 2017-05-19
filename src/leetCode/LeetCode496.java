package leetCode;

import java.util.ArrayDeque;
import java.util.HashMap;

/**
 * Created by Sarveswara Tippireddy on 5/18/2017.
 * https://leetcode.com/problems/next-greater-element-i/
 */
public class LeetCode496 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                map.put(stack.pop(), nums[i]);
            }
            stack.push(nums[i]);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        for (int i = 0; i < findNums.length; i++) {
            findNums[i] = map.get(findNums[i]);
        }
        return findNums;
    }
}
