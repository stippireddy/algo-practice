package leetcode;

import java.util.*;

public class Leetcode2050 {
    public int minimumTime(int n, int[][] relations, int[] time) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] indegree = new int[n + 1];
        int[] costTillCourse = new int[n + 1];
        for (int[] relation : relations) {
            graph.putIfAbsent(relation[0], new ArrayList<>());
            graph.get(relation[0]).add(relation[1]);
            indegree[relation[1]]++;
        }
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 1; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        int totalTime = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int course = q.poll();
                costTillCourse[course] += time[course - 1];
                if (graph.containsKey(course)) {
                    for (int next : graph.get(course)) {
                        indegree[next]--;
                        costTillCourse[next] = Integer.max(costTillCourse[course], costTillCourse[next]);
                        if (indegree[next] == 0) {
                            q.add(next);
                        }
                    }
                }
                totalTime = Integer.max(totalTime, costTillCourse[course]);
            }
        }
        return totalTime;
    }
}