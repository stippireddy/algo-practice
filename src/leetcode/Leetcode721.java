package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Leetcode721 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, List<String>> graph = new HashMap<>();
        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            graph.putIfAbsent(firstEmail, new ArrayList<>());
            for (int i = 2; i < account.size(); i++) {
                String currentEmail = account.get(i);
                graph.get(firstEmail).add(currentEmail);
                graph.putIfAbsent(currentEmail, new ArrayList<>());
                graph.get(currentEmail).add(firstEmail);
            }
        }

        List<List<String>> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        for (List<String> account : accounts) {
            String firstAccount = account.get(1);
            if (!visited.contains(firstAccount)) {
                List<String> subResult = new ArrayList<>();
                result.add(subResult);
                dfs(account.get(0), graph, visited, subResult);
            }
        }
        return result;
    }

    private void dfs(String account, Map<String, List<String>> graph, Set<String> visited, List<String> subResult) {
        if (visited.contains(account)) {
            return;
        }
        visited.add(account);
        subResult.add(account);
        for (String nextAccount : graph.get(account)) {
            dfs(nextAccount, graph, visited, subResult);
        }
    }
}
