package leetcode;

/**
 * Created by Sarveswara Tippireddy on Jul 24, 2017
 *
 * <p>This is a LeetCode problem. The problem statement can be found @
 * https://leetcode.com/problems/binary-search-tree-iterator/description/
 */

import java.lang.reflect.Array;
import java.util.ArrayDeque;

import karumanchi.trees.TreeNode;

class BSTIterator {
    ArrayDeque<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new ArrayDeque<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode root = stack.pop();
        if (root.right != null) {
            TreeNode temp = root.right;
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
        }
        return root.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
