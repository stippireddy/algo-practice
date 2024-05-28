package leetcode;

import java.util.*;

public class Leetcode1443 {
    public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[n];
        for (int[] edge : edges) {
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.putIfAbsent(edge[1], new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        visited[0] = true;
        int steps = 0;
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int current = queue.poll();
                for (int next : graph.get(current)) {
                    int apples = 0;
                    if (!visited[next]) {
                        queue.offer(next);
                        visited[next] = true;
                        if (hasApple.get(next)) {
                            apples++;
                        }
                    }
                    if (apples > 0) {
                        steps = steps + 2 * apples + 2 * depth;
                    }
                }
            }
            depth++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(minTime(7,
                new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}},
                Arrays.asList(false, false, true, false, true, true, false)));
    }
}
