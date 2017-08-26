/**
 * Created by Sarveswara Tippireddy on Aug 26, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/linked-list-cycle-ii/description/
 */
package leetCode;

public class LeetCode142 {
  public ListNode detectCycle(ListNode head) {
    ListNode tortoise = head;
    ListNode hare = head;
    while (tortoise != null && hare != null) {
      tortoise = tortoise.next;
      hare = hare.next;
      if (hare == null) {
        return null;
      }
      hare = hare.next;
      if (hare == tortoise) {
        hare = head;
        while (hare != tortoise) {
          hare = hare.next;
          tortoise = tortoise.next;
        }
        return hare;
      }
    }
    return null;
  }
}
