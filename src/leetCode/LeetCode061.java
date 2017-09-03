/**
 * Created by Sarveswara Tippireddy on Sep 3, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/rotate-list/description/
 * 
 */
package leetCode;

public class LeetCode061 {
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null) {
      return head;
    }
    int size = 0;
    ListNode iterator = head;
    while (iterator != null) {
      iterator = iterator.next;
      size++;
    }
    int moveForward = k%size;
    iterator = head;
    while (moveForward > 0) {
      iterator = iterator.next;
      moveForward--;
    }
    ListNode chainBreaker = head;
    while (iterator.next != null) {
      iterator = iterator.next;
      chainBreaker = chainBreaker.next;
    }
    iterator.next = head;
    head = chainBreaker.next;
    chainBreaker.next = null;
    return head;
  }
}
