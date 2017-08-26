package leetCode;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

public class LeetCode142Test {

  @Test
  public void detectCycle() {
    LeetCode142 l = new LeetCode142();
    assertNull(l.detectCycle(ListUtils.createList(new int[] {1, 2, 3, 4, 5, 6})));
    assertNull(l.detectCycle(ListUtils.createList(new int[] {1})));
    assertNull(l.detectCycle(ListUtils.createList(new int[] {})));
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    ListNode node6 = new ListNode(6);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;
    node6.next = node1;
    assertEquals(l.detectCycle(node1), node1);
    node6.next = node3;
    assertEquals(l.detectCycle(node1), node3);
    node6.next = node4;
    assertEquals(l.detectCycle(node1), node4);
    node6.next = node5;
    assertEquals(l.detectCycle(node1), node5);
  }
}
