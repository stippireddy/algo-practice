package leetCode;

public class LeetCode206 {
  public ListNode reverseList(ListNode head) {
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
}
