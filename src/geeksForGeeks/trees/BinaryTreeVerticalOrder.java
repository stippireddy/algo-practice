package geeksForGeeks.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import karumanchi.trees.TreeNode;

//TODO create test cases
public class BinaryTreeVerticalOrder {
  void verticalOrder(TreeNode root) {
    TreeMap<Integer, List<Integer>> map = new TreeMap<>();
    verticalOrderHelper(map, 0, root);
    StringBuffer sb = new StringBuffer();
    for (List<Integer> list : map.values()) {
      for (int i : list) {
        sb.append(i).append(" ");
      }
      sb.append("$");
    }
    System.out.println(sb.toString());
  }

  private void verticalOrderHelper(TreeMap<Integer, List<Integer>> map, int i, TreeNode node) {
    if (map.get(i) == null) {
      map.put(i, new ArrayList<Integer>());
    }
    map.get(i).add(node.val);
    if (node.left != null) {
      verticalOrderHelper(map, i - 1, node.left);
    }
    if (node.right != null) {
      verticalOrderHelper(map, i + 1, node.right);
    }
  }
}
