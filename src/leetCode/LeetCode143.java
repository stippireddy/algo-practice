/**
 * Created by Sarveswara Tippireddy on Aug 26, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/reorder-list/description/
 */
package leetCode;

public class LeetCode143 {

  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }
    ListNode fast = head, slow = head, prevSlow = null;
    while (fast != null) {
      prevSlow = slow;
      slow = slow.next;
      fast = fast.next;
      if (fast == null) {
        break;
      }
      fast = fast.next;
    }
    prevSlow.next = null;
    ListNode reversedListHead = null;
    while (slow != null) {
      ListNode temp = slow.next;
      slow.next = reversedListHead;
      reversedListHead = slow;
      slow = temp;
    }
    fast = head;
    slow = reversedListHead;
    while (slow != null) {
      ListNode temp = fast.next;
      fast.next = slow;
      slow = slow.next;
      fast.next.next = temp;
      fast = temp;
    }
  }
}
