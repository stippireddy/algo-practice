package leetCode;

public class LeetCode445 {
  
  public ListNode addTwoNumbersUsingStacks(ListNode l1, ListNode l2) {}
  
  public ListNode addTwoNumbersByReversingInputs(ListNode l1, ListNode l2) {
    l1 = reverseList(l1);
    l2 = reverseList(l2);
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
    ListNode temp = result;
    result = result.next;
    temp.next = null;
    return reverseList(result);
  }

  private ListNode reverseList(ListNode head) {
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
