/**
 * Created by Sarveswara Tippireddy on Aug 25, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/linked-list-cycle/description/
 */
package leetcode;

public class LeetCode141 {

  public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (slow != null && fast != null) {
      slow = slow.next;
      fast = fast.next;
      if (fast == null) {
        return false;
      }
      fast = fast.next;
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }
}
