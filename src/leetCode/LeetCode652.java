/**
 * Created by Sarveswara Tippireddy on Aug 6, 2017
 *
 * <p>This LeetCode problem can be found @
 * https://leetcode.com/problems/find-duplicate-subtrees/description/
 */
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import karumanchi.trees.TreeNode;

public class LeetCode652 {

  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    ArrayList<TreeNode> result = new ArrayList<>();
    HashMap<String, TreeNode> map = new HashMap<>();
    helper(root, result, map);
    for (String s : map.keySet()) {
      TreeNode r = map.get(s);
      if (r != null) {
        result.add(r);
      }
    }
    return result;
  }

  private String helper(TreeNode root, ArrayList<TreeNode> result, HashMap<String, TreeNode> map) {
    if (root == null) {
      return "#";
    }
    StringBuffer sb = new StringBuffer();
    sb.append(root.val)
        .append(helper(root.left, result, map))
        .append(helper(root.right, result, map));
    String key = sb.toString();
    if (map.containsKey(key)) {
      map.put(key, root);
    } else {
      map.put(key, null);
    }
    return key;
  }
}
