package leetcode;

public class LeetCode206 {

  public ListNode reverseListIterative(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode result = null;
    while (head != null) {
      ListNode temp = head.next;
      head.next = result;
      result = head;
      head = temp;
    }
    return result;
  }

  public ListNode reverseListRecursive(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode result = reverseListRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return result;
  }
}
