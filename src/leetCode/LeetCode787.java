package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] flight : flights) {
            graph[flight[0]].add(new int[]{flight[1], flight[2]});
        }
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int[] distances = new int[n];
        Arrays.fill(distances, -1);
        distances[src] = 0;
        q.add(new int[]{src, 0});
        for (int i = 0; i <= k; i++) {
            if (!q.isEmpty()) {
                int size = q.size();
                for (int j = 0; j < size; j++) {
                    int[] currentStop = q.poll();
                    for (int[] nextStop : graph[currentStop[0]]) {
                        int cost = nextStop[1] + currentStop[1];
                        if (distances[nextStop[0]] == -1 || distances[nextStop[0]] > cost) {
                            distances[nextStop[0]] = cost;
                            q.offer(new int[]{nextStop[0], cost});
                        }
                    }
                }
            }
        }
        return distances[dst];
    }
}
