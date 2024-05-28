package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode199 {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> rightView = new ArrayList<>();
        helper(root, rightView, 0);
        return rightView;
    }

    private void helper(TreeNode root, ArrayList<Integer> rightView, int depth) {
        if (root == null) {
            return;
        }
        if (rightView.size() == depth) {
            rightView.add(root.val);
        }
        helper(root.right, rightView, depth + 1);
        helper(root.left, rightView, depth + 1);
    }
}
