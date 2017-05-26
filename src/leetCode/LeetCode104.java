package leetCode;

/**
 * Created by Sarveswara Tippireddy on 5/20/2017.
 */
public class LeetCode104 {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Integer.max(maxDepth(root.left), maxDepth(root.right));
	}
}
