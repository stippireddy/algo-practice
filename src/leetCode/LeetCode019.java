/**
 * Created by Sarveswara Tippireddy on Aug 28, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 */
package leetCode;

public class LeetCode019 {

  public ListNode removeNthFromEndTwoPasses(ListNode head, int n) {
    ListNode iterator = new ListNode(-1);
    iterator.next = head;
    head = iterator;
    int size = 0;
    while (iterator != null) {
      iterator = iterator.next;
      size++;
    }
    int m = size - n - 1;
    iterator = head;
    while (m > 0) {
      iterator = iterator.next;
      m--;
    }
    iterator.next = iterator.next.next;
    return head.next;
  }

  public ListNode removeNthFromEndSinglePass(ListNode head, int n) {
    if (head == null) {
      return head;
    }
    ListNode nodeFinder = new ListNode(-1);
    nodeFinder.next = head;
    head = nodeFinder;
    while (n > 0) {
      nodeFinder = nodeFinder.next;
      n--;
    }
    ListNode nodeDeleter = head;
    while (nodeFinder.next != null) {
      nodeDeleter = nodeDeleter.next;
      nodeFinder = nodeFinder.next;
    }
    nodeDeleter.next = nodeDeleter.next.next;
    return head.next;
  }
}
