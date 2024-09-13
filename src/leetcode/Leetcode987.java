package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Leetcode987 {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(0, root));
        int row = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                Pair current = q.poll();
                map.putIfAbsent(current.column, new TreeMap<>());
                map.get(current.column).putIfAbsent(row, new ArrayList<>());
                map.get(current.column).get(row).add(current.node.val);
                if (current.node.right != null) {
                    q.add(new Pair(current.column + 1, current.node.right));
                }
                if (current.node.left != null) {
                    q.add(new Pair(current.column - 1, current.node.left));
                }
            }
            row++;
        }
        return map.values().stream().map(
                        innerMap -> innerMap.values().stream()
                                .flatMap(list -> list.stream().sorted())
                                .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    class Pair {
        int column;
        TreeNode node;

        public Pair(int column, TreeNode node) {
            this.column = column;
            this.node = node;
        }
    }
}
