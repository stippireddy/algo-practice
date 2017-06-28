package leetCode;

public class LeetCode24 {
  public ListNode swapPairsRecursive(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode result = head.next;
    head.next = swapPairsRecursive(head.next.next);
    result.next = head;
    return result;
  }

  public ListNode swapPairsIterative(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode result = new ListNode(-1);
    ListNode prev = result;
    while (head != null && head.next != null) {
      prev.next = head.next;
      head.next = head.next.next;
      prev.next.next = head;
      prev = head;
      head = head.next;
    }
    return result.next;
  }
}
