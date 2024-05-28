package leetcode;

public class LeetCode092 {

  public ListNode reverseBetween(ListNode head, int m, int n) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode result = dummy;
    int i = 0;
    while (dummy != null && i < m - 1) {
      dummy = dummy.next;
      i++;
    }
    ListNode lastNodeOfUnreversedList = dummy;
    ListNode headOfReversedPart = null;
    dummy = dummy.next;
    ListNode tailOfReversedPart = dummy;
    i = m;
    while (dummy != null && i < n + 1) {
      ListNode temp = dummy.next;
      dummy.next = headOfReversedPart;
      headOfReversedPart = dummy;
      dummy = temp;
      i++;
    }
    tailOfReversedPart.next = dummy;
    lastNodeOfUnreversedList.next = headOfReversedPart;
    return result.next;
  }
}
