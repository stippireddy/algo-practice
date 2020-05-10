package leetCode;

import karumanchi.trees.TreeNode;

public class LeetCode606 {

  public String tree2strRecursive(TreeNode t) {
    StringBuffer sb = new StringBuffer();
    stringBuilder(t, sb);
    return sb.toString();
  }

  private void stringBuilder(TreeNode t, StringBuffer sb) {
    if (t == null) {
      return;
    }
    sb.append(t.val);
    if (t.left != null || t.right != null) {
      sb.append('(');
      stringBuilder(t.left, sb);
      sb.append(')');
      if (t.right != null) {
        sb.append('(');
        stringBuilder(t.right, sb);
        sb.append(')');
      }
    }
  }

  public String tree2strIterative(TreeNode t) {
    //https://leetcode.com/articles/construct-string-from-binary-tree/
    //TODO Complete this
    return null;
  }
}
