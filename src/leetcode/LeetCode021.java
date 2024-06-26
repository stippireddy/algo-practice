package leetcode;

public class LeetCode021 {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode result = null;
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    } else {
      if (l1.val > l2.val) {
        result = l2;
        l2 = l2.next;
      } else {
        result = l1;
        l1 = l1.next;
      }
      result.next = null;
    }
    ListNode nodeToBeReturned = result;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        result.next = l1;
        l1 = l1.next;
      } else {
        result.next = l2;
        l2 = l2.next;
      }
      result = result.next;
    }
    if (l1 != null) {
      result.next = l1;
    }
    if (l2 != null) {
      result.next = l2;
    }
    return nodeToBeReturned;
  }
}
