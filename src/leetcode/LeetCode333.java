package leetcode;

import java.util.*;

public class LeetCode333 {

    int maxSize;

    public int largestBSTSubtree(TreeNode root) {
        helper(root);
        return maxSize;
    }

    private Result helper(TreeNode root) {
        if (root == null) {
            return new Result(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        if (root.left == null && root.right == null) {
            maxSize = Integer.max(maxSize, 1);
            return new Result(true, 1, root.val, root.val);
        }
        Result left = helper(root.left);
        Result right = helper(root.right);
        if (!left.isBST || !right.isBST || root.val <= left.max || root.val >= right.min) {
            return new Result(false, 0, -1, -1);
        }
        int size = left.size + right.size + 1;
        maxSize = Integer.max(size, maxSize);
        return new Result(true, size, Integer.max(root.val, right.max), Integer.min(root.val, left.min));
    }

    class Result {
        boolean isBST;
        int size;
        int max;
        int min;

        Result(boolean isBST, int size, int max, int min) {
            this.isBST = isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }
}
