package leetcode;

import java.util.Arrays;
import java.util.Random;

class Solution {
    int[] weights;
    Random r;
    int sum;

    public Solution(int[] w) {
        weights = new int[w.length];
        sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            weights[i] = sum;
        }
        r = new Random();
    }

    public int pickIndex() {
        int index = Arrays.binarySearch(weights, r.nextInt(sum) + 1);
        return index < 0 ? -index - 1 : index;
    }
}