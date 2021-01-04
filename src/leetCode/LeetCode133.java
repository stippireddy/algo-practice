package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode133 {

  public Node cloneGraph(Node node) {
    if (node == null) {
      return null;
    }
    HashMap<Node, Node> map = new HashMap<>();
    helper(node, map);
    return map.get(node);
  }

  private void helper(Node node, HashMap<Node, Node> map) {
    if (node == null || map.containsKey(node)) {
      return;
    }
    map.putIfAbsent(node, new Node(node.val));
    for (Node n : node.neighbors) {
      helper(n, map);
      map.get(node).neighbors.add(map.get(n));
    }
  }

  static class Node {

    public int val;
    public List<Node> neighbors;

    public Node() {
      val = 0;
      neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
      val = _val;
      neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
      val = _val;
      neighbors = _neighbors;
    }
  }
}
