package leetcode;   

public class Leetcode270 {
    public int closestValue(TreeNode root, double target) {
        int closestVal = root.val;
        while (root != null) {
            if (Math.abs(root.val - target) < Math.abs(closestVal - target) || (Math.abs(root.val - target) == Math.abs(closestVal - target) && root.val < closestVal)) {
                closestVal = root.val;
            }
            if (target < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return closestVal;
    }
}
