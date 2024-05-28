package leetcode;

import java.util.*;

public class Leetcode398 {
    class Solution {

        private Map<Integer, List<Integer>> map;

        private Random r;

        public Solution(int[] nums) {
            map = new HashMap<>();
            r = new Random();
            for (int i = 0; i < nums.length; i++) {
                map.putIfAbsent(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }

        public int pick(int target) {
            int index = r.nextInt(map.get(target).size());
            return map.get(target).get(index);
        }
    }

}
