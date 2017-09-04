/**
 * Created by Sarveswara Tippireddy on Sep 1, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * 
 */
package leetCode;

public class LeetCode160 {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int length1 = getLength(headA);
    int length2 = getLength(headB);
    while (length1 > length2) {
      headA = headA.next;
      length1--;
    }
    while (length2 > length1) {
      headB = headB.next;
      length2--;
    }
    while ((headA != null && headB != null) && (headA.val != headB.val)) {
      headA = headA.next;
      headB = headB.next;
    }
    return headA;
  }

  private int getLength(ListNode root) {
    int length = 0;
    while (root != null) {
      root = root.next;
      length++;
    }
    return length;

  }
}
