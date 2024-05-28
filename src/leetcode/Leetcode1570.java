package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1570 {
}

class SparseVector {

    Map<Integer, Integer> map;

    SparseVector(int[] nums) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                map.put(i, nums[i]);
            }
        }
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int result = 0;
        for (int i : map.keySet()) {
            if (vec.map.containsKey(i)) {
                result += map.get(i) * vec.map.get(i);
            }
        }
        return result;
    }
}