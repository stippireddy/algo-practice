package leetCode;

public class LeetCode430 {

  public Node flatten(Node head) {
    if (head == null) {
      return head;
    }
    return helper(head)[0];
  }

  private Node[] helper(Node head) {
    Node[] result = new Node[2];
    result[0] = head;
    while (head != null) {
      result[1] = head;
      Node next = head.next;
      if (head.child != null) {
        Node[] subResult = helper(head.child);
        result[1] = subResult[1];
        head.next = subResult[0];
        subResult[0].prev = head;
        if (next != null) {
          subResult[1].next = next;
          next.prev = subResult[1];
        }
      }
      head = next;
    }
    return result;
  }
}

class Node {

  public int val;
  public Node prev;
  public Node next;
  public Node child;
}
