package leetcode;

import java.util.Arrays;
import java.util.Random;

public class Leetcode384 {
    private class Solution {
        int[] original;
        Random r;

        public Solution(int[] nums) {
            original = nums;
            r = new Random();
        }

        public int[] reset() {
            return original;
        }

        public int[] shuffle() {
            int[] shuffle = Arrays.copyOf(original, original.length);
            for (int i = shuffle.length - 1; i >= 0; i--) {
                int j = r.nextInt(i + 1);
                int temp = shuffle[i];
                shuffle[i] = shuffle[j];
                shuffle[j] = temp;
            }
            return shuffle;
        }
    }
}

