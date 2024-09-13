package leetcode;

import java.util.*;

public class LeetCode863 {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> result = new ArrayList<>();
        Map<TreeNode, TreeNode> parents = new HashMap<>();
        setParents(root, parents, null);
        HashSet<TreeNode> visited = new HashSet<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(target);
        visited.add(target);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                TreeNode current = q.poll();
                if (K == 0) {
                    result.add(current.val);
                    continue;
                }
                if(current.left != null && !visited.contains(current.left)) {
                    q.add(current.left);
                    visited.add(current.left);
                }
                if(current.right != null && !visited.contains(current.right)) {
                    q.add(current.right);
                    visited.add(current.right);
                }
                if(parents.get(current) != null && !visited.contains(parents.get(current))) {
                    q.add(parents.get(current));
                    visited.add(parents.get(current));
                }
            }
            K--;
        }
        return result;
    }

    private void setParents(TreeNode node, Map<TreeNode, TreeNode> parents, TreeNode parent) {
        if (node == null) {
            return;
        }
        parents.put(node, parent);
        setParents(node.left, parents, node);
        setParents(node.right, parents, node);
    }
}
