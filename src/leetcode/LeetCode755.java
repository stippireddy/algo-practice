package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode755 {
    public static int[] pourWater(int[] heights, int volume, int k) {
        PriorityQueue<int[]> left = new PriorityQueue<>((a, b) -> a[0] == b[0] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
        PriorityQueue<int[]> right = new PriorityQueue<>((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        right.add(new int[]{heights[k], k});
        int i = k - 1, j = k + 1;
        while (volume-- > 0) {
            while (i >= 0 && heights[i] <= heights[i + 1]) {
                left.add(new int[]{heights[i], i});
                i--;
            }
            while (j < heights.length && heights[j] <= heights[j - 1]) {
                right.add(new int[]{heights[j], j});
                j++;
            }
            if (!left.isEmpty() && left.peek()[0] < heights[k]) {
                int[] temp = left.poll();
                temp[0]++;
                left.add(temp);
                heights[temp[1]]++;
            } else {
                int[] temp = right.poll();
                temp[0]++;
                right.add(temp);
                heights[temp[1]]++;
            }
        }
        return heights;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pourWater(new int[]{1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1}, 10, 2)));
    }
}
