package leetcode;

public class LeetCode083 {

  public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode result = head;
    ListNode prev = head;
    head = head.next;
    while (head != null) {
      if (prev.val == head.val) {
        prev.next = head.next;
        head = head.next;
      } else {
        prev = head;
        head = head.next;
      }
    }
    return result;
  }
}
