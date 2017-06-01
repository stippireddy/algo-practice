package leetCode;

public class LeetCode160 {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode temp1 = headA;
    int length1 = 0;
    while (temp1 != null) {
      temp1 = temp1.next;
      length1++;
    }
    temp1 = headB;
    int length2 = 0;
    while (temp1 != null) {
      temp1 = temp1.next;
      length2++;
    }
    
    if (length1 > length2) {
      int diff = length1 - length2;
      while (diff > 0) {
        headA = headA.next;
        diff--;
      }
    } else if (length2 > length1) {
      int diff = length2 - length1;
      while (diff > 0) {
        headB = headB.next;
        diff--;
      }
    }
    while (headA != null && headB != null) {
      if (headA.val == headB.val) {
        return headA;
      }
      headA = headA.next;
      headB = headB.next;
    }
    return null;
  }
}
