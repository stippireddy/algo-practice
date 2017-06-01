package leetCode;

import java.util.ArrayList;

public class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }

  @Override
  public boolean equals(Object obj) {
    ListNode other = (ListNode) obj;
    if (this.val != other.val) {
      return false;
    }
    if (this.next == null && other.next == null) {
      return true;
    } else if (this.next == null && other.next != null) {
      return false;
    } else if (this.next != null && other.next == null) {
      return false;
    } else {
      if (!this.next.equals(other.next)) {
        return false;
      }
    }
    return true;
  }

  public static ArrayList<ListNode> printList(ListNode head) {
    ArrayList<ListNode> list = new ArrayList<>();
    while (head != null) {
      list.add(head);
      head = head.next;
    }
    return list;
  }

  public static ListNode createList(int[] array) {
    if (array.length < 1) {
      return null;
    }
    ListNode head = new ListNode(array[0]);
    ListNode nodeToBeReturned = head;
    for (int i = 1; i < array.length; i++) {
      head.next = new ListNode(array[i]);
      head = head.next;
    }
    return nodeToBeReturned;
  }
}
