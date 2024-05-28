package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Leetcode314 {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        bfs(root, map);
        return new ArrayList<>(map.values());
    }

    private void bfs(TreeNode root, TreeMap<Integer, List<Integer>> map) {
        if (root == null) {
            return;
        }
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair current = q.poll();
            map.putIfAbsent(current.index, new ArrayList<>());
            map.get(current.index).add(current.node.val);
            if (current.node.left != null) {
                q.add(new Pair(current.index - 1, current.node.left));
            }
            if (current.node.right != null) {
                q.add(new Pair(current.index + 1, current.node.right));
            }
        }
    }

    private class Pair {
        int index;
        TreeNode node;

        public Pair(int i, TreeNode root) {
            this.index = i;
            this.node = root;
        }
    }
}
