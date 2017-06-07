package leetCode;

import java.util.ArrayList;

public class ListUtils {

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

  public static int[] listToArray(ListNode head) {
    int size = 0;
    ListNode temp = head;
    while (head != null) {
      size++;
      head = head.next;
    }
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = temp.val;
      temp = temp.next;
    }
    return array;
  }

  public static ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    return prev;
  }
}
