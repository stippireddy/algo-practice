package leetcode;

import java.util.LinkedList;
import java.util.List;
import karumanchi.trees.TreeNode;

public class LeetCode107 {

  /* This solution uses DFS to add the nodes in the appropriate sublist which is identified by the level*/
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> list = new LinkedList<>();
    levelOrderBottomHelper(root, list, 0);
    int i = 0, j = list.size() - 1;
    while (i < j) {
      List<Integer> temp = list.get(i);
      list.set(i, list.get(j));
      list.set(j, temp);
      i++;
      j--;
    }
    return list;
  }

  private void levelOrderBottomHelper(TreeNode root, List<List<Integer>> list, int level) {
    if (root == null) {
      return;
    }
    if (list.size() < level + 1) {
      List<Integer> sublist = new LinkedList<>();
      list.add(sublist);
    }
    list.get(level).add(root.val);
    levelOrderBottomHelper(root.left, list, level + 1);
    levelOrderBottomHelper(root.right, list, level + 1);
  }

  /*The above solution can be optimized by using a LinkedList and adding the sublist at the first of the LinkedList*/
  public List<List<Integer>> levelOrderBottomOptimized(TreeNode root) {
    LinkedList<List<Integer>> list = new LinkedList<>();
    levelOrderBottomHelper(root, list, 0);
    return list;
  }

  private void levelOrderBottomHelper(TreeNode root, LinkedList<List<Integer>> list, int level) {
    if (root == null) {
      return;
    }
    if (list.size() < level + 1) {
      List<Integer> sublist = new LinkedList<>();
      list.addFirst(sublist);
    }
    list.get(list.size() - 1 - level).add(root.val);
    levelOrderBottomHelper(root.left, list, level + 1);
    levelOrderBottomHelper(root.right, list, level + 1);
  }
}
