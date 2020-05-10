package leetCode;

public class LeetCode002 {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode head = new ListNode(-1);
    ListNode result = head;
    while (l1 != null && l2 != null) {
      int val = l1.val + l2.val + carry;
      head.next = new ListNode(val % 10);
      head = head.next;
      carry = val / 10;
      l1 = l1.next;
      l2 = l2.next;
    }

    while (l1 != null) {
      int val = l1.val + carry;
      head.next = new ListNode(val % 10);
      head = head.next;
      carry = val / 10;
      l1 = l1.next;
    }

    while (l2 != null) {
      int val = l2.val + carry;
      head.next = new ListNode(val % 10);
      head = head.next;
      carry = val / 10;
      l2 = l2.next;
    }

    if (carry > 0) {
      head.next = new ListNode(carry);
    }

    return result.next;
  }
}
