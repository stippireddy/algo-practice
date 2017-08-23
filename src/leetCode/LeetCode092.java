package leetCode;

public class LeetCode092 {
  s
  public ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode result = head;
    int diff = n - m + 1;
    while (m > 2 && head != null) {
      head = head.next;
      m--;
    }
    if (diff > 1) {
      head.next = helper(head.next, diff);
    }
    return result;
  }

  private ListNode helper(ListNode head, int diff) {
    ListNode head1 = head;
    ListNode result = null;
    while (diff-- > 0) {
      ListNode temp = head.next;
      head.next = result;
      result = head;
      head = temp;
    }
    head1.next = head;
    return result;
  }
}
