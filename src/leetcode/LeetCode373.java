package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class LeetCode373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> nums1[a[0] + nums2[a[1]]]));
        pq.add(new int[]{0, 0});
        Set<String> visited = new HashSet<>();
        visited.add(Arrays.toString(new int[]{0, 0}));
        while (k-- > 0) {
            int[] current = pq.poll();
            int i = current[0];
            int j = current[1];
            result.add(Arrays.asList(i, j));
            if (i < nums1.length) {
                int[] next = {i + 1, j};
                if(visited.add(Arrays.toString(next))) {
                    pq.add(next);
                }
            }
            if(j < nums2.length) {
                int[] next = {i, j + 1};
                if(visited.add(Arrays.toString(next))) {
                    pq.add(next);
                }
            }
        }
        return result;
    }
}
