package leetCode;

public class DeleteBSTNode {

}

// https://leetcode.com/problems/delete-node-in-a-bst/?tab=Description
class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

class Solution {

	public TreeNode deleteNode(TreeNode root, int key) {
		TreeNode n = root;
		TreeNode m = null;
		boolean isFound = false;
		boolean isLeftElement = false;
		while (n != null && !isFound) {
			m = n;
			if (n.val == key) {
				isFound = true;
			} else if (n.val < key) {
				n = root.left;
				isLeftElement = true;
			} else {
				n = root.right;
				isLeftElement = false;
			}
		}

		if (isFound) {
			if (n.right == null && n.left == null) {
				if (isLeftElement) {
					m.left = null;
				} else {
					m.right = null;
				}
			} else if (n.right == null) {
				if (isLeftElement) {
					m.left = n.left;
				} else {
					m.right = n.left;
				}
			} else {
				if (isLeftElement) {
					m.left = n.right;
					m.left.left = n.left;
				} else {
					m.right = n.right;
					m.right.left = n.right;
				}
			}
			return root;
		}
		return root;
	}
}