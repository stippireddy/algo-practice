package leetcode;

public class LeetCode328 {

  public ListNode oddEvenList(ListNode head) {
    ListNode oddPrev = new ListNode(-1);
    ListNode oddHead = oddPrev;
    ListNode evenPrev = new ListNode(-1);
    ListNode evenHead = evenPrev;
    while (head != null) {
      oddPrev.next = head;
      oddPrev = head;
      head = head.next;
      oddPrev.next = null;
      if (head != null) {
        evenPrev.next = head;
        evenPrev = head;
        head = head.next;
        evenPrev.next = null;
      }
    }
    oddPrev.next = evenHead.next;
    return oddHead.next;
  }
}
