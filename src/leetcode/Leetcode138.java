package leetcode;

import java.util.HashMap;

public class Leetcode138 {

  public Node copyRandomList(Node head) {
    if (head == null) {
      return null;
    }
    Node node = head;
    while (node != null) {
      Node temp = new Node(node.val);
      temp.next = node.next;
      node.next = temp;
      node = node.next.next;
    }
    node = head;
    while (node != null) {
      if (node.random != null) {
        node.next.random = node.random.next;
      }
      node = node.next.next;
    }
    node = head;
    Node prev = new Node(-1);
    head = prev;
    while (node != null) {
      prev.next = node.next;
      node.next = node.next.next;
      prev = prev.next;
      node = node.next;
    }
    return head.next;
  }

  public Node copyRandomListUsingHashMap(Node head) {
    if (head == null) {
      return null;
    }
    HashMap<Node, Node> map = new HashMap<>();
    Node node = head;
    while (node != null) {
      map.put(node, new Node(head.val));
      node = head.next;
    }
    node = head;
    while (node != null) {
      if (node.next != null) {
        map.get(node).next = map.get(node.next);
      }
      if (node.random != null) {
        map.get(node).random = map.get(node.random);
      }
      node = node.next;
    }
    return map.get(head);
  }

  static class Node {

    int val;
    Node next;
    Node random;

    public Node(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
    }
  }
}
