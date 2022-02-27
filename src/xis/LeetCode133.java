package xis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode133 {

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

  public Node cloneGraph(Node node) {
    if (node == null) {
      return null;
    }
    HashMap<Node, Node> map = new HashMap<>();
    dfs(node, map);
    return map.get(node);
  }

  private void dfs(Node node, Map<Node, Node> map) {
    if (map.containsKey(node)) {
      return;
    }
    Node clonedNode = new Node(node.val);
    map.put(node, clonedNode);
    for (Node neighbor : node.neighbors) {
      dfs(neighbor, map);
      clonedNode.neighbors.add(map.get(neighbor));
    }
  }
}
