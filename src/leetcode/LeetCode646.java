package leetcode;

import java.util.Arrays;

public class LeetCode646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int result = 1;
        int end = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (end < pairs[i][0]) {
                result++;
                end = pairs[i][1];
            }
        }
        return result;
    }
}
