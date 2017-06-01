package leetCode;

public class LeetCode203 {
  public ListNode removeElements(ListNode head, int val) {
    ListNode prev = head;
    while (head != null && head.val == val) {
      prev = head;
      head = head.next;
    }
    ListNode nodeToBeReturned = head;
    prev = head;
    if (head == null) {
      return nodeToBeReturned;
    }
    head = head.next;
    prev.next = null;
    while (head != null) {
      if (head.val == val) {
        while (head != null && head.val == val) {
          head = head.next;
        }
      }
      prev.next = head;
      prev = head;
      if (head != null) {
        head = head.next;
      }
    }
    return nodeToBeReturned;
  }
  
  public ListNode removeElementsRecursive(ListNode head, int val) {
    if (head == null) {
      return null;
    }
    ListNode next = removeElementsRecursive(head.next, val);
    if (head.val == val) {
      return next;
    }
    head.next = next;
    return head;
  }
}
