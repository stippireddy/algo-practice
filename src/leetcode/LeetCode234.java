/**
 * Created by Sarveswara Tippireddy on Aug 27, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/palindrome-linked-list/description/
 */
package leetcode;

public class LeetCode234 {

  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }
    ListNode slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode mid = slow.next;
    slow.next = null;
    ListNode reversedListHead = reverseList(mid);
    while (reversedListHead != null) {
      if (reversedListHead.val != head.val) {
        return false;
      }
      reversedListHead = reversedListHead.next;
      head = head.next;
    }
    return true;
  }

  private ListNode reverseList(ListNode mid) {
    ListNode reversedListHead = null;
    while (mid != null) {
      ListNode temp = mid.next;
      mid.next = reversedListHead;
      reversedListHead = mid;
      mid = temp;
    }
    return reversedListHead;
  }
}
