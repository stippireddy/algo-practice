package leetcode;

import java.util.*;

public class Leetcode1443 {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Node[] graph = new Node[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new Node(i, hasApple.get(i));
        }
        for(int[] edge : edges) {
            int i = edge[0];
            int j = edge[1];
            graph[i].neighbors.add(graph[j]);
            graph[j].neighbors.add(graph[i]);
        }
        boolean[] visited = new boolean[n];
        return helper(graph, 0, visited);
    }

    private int helper(Node[] graph, int i, boolean[] visited) {

    }

    class Node {
        private int val;
        private boolean hasApple;
        private List<Node> neighbors;
        private int time;

        Node(int val, boolean hasApple) {
            this.val = val;
            this.hasApple = hasApple;
            this.neighbors = new ArrayList<>();
            this.time = 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(minTime(7,
                new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}},
                Arrays.asList(false, false, true, false, true, true, false)));
    }
}
