package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode141Test {

  @Test
  public void hasCycle() {
    LeetCode141 l = new LeetCode141();
    assertFalse(l.hasCycle(ListUtils.createList(new int[]{1, 2, 3, 4, 5, 6})));
    assertFalse(l.hasCycle(ListUtils.createList(new int[]{1})));
    assertFalse(l.hasCycle(ListUtils.createList(new int[]{})));
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
    assertTrue(l.hasCycle(node1));
    node6.next = node3;
    assertTrue(l.hasCycle(node1));
    node6.next = node4;
    assertTrue(l.hasCycle(node1));
    node6.next = node5;
    assertTrue(l.hasCycle(node1));
  }
}
