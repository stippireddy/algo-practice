package leetcode;

import java.util.ArrayDeque;

public class LeetCode445 {

  public ListNode addTwoNumbersReversingSolution(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode temp = l1;
    int m = 0;
    while (temp != null) {
      temp = temp.next;
      m++;
    }
    temp = l2;
    int n = 0;
    while (temp != null) {
      temp = temp.next;
      n++;
    }
    ListNode result = null;
    while (m > n) {
      result = addToFront(result, l1.val);
      l1 = l1.next;
      m--;
    }
    while (n > m) {
      result = addToFront(result, l2.val);
      l2 = l2.next;
      n--;
    }
    while (m > 0) {
      result = addToFront(result, l1.val + l2.val);
      l1 = l1.next;
      l2 = l2.next;
      m--;
      n--;
    }
    int carry = 0;
    temp = result;
    while (temp.next != null) {
      int sum = temp.val + carry;
      temp.val = sum % 10;
      carry = sum / 10;
      temp = temp.next;
    }
    int sum = temp.val + carry;
    temp.val = sum % 10;
    carry = sum / 10;
    if (carry > 0) {
      temp.next = new ListNode(carry);
    }
    result = reverseList(result);
    return result;
  }

  private ListNode addToFront(ListNode head, int sum) {
    ListNode temp = new ListNode(sum);
    temp.next = head;
    return temp;
  }

  public ListNode addTwoNumbersUsingStacks(ListNode l1, ListNode l2) {
    ArrayDeque<ListNode> list1 = new ArrayDeque<>();
    ArrayDeque<ListNode> list2 = new ArrayDeque<>();
    while (l1 != null) {
      list1.push(l1);
      l1 = l1.next;
    }
    while (l2 != null) {
      list2.push(l2);
      l2 = l2.next;
    }
    int carry = 0;
    ListNode head = null;
    while (!list1.isEmpty() && !list2.isEmpty()) {
      int sum = carry + list1.pop().val + list2.pop().val;
      if (sum > 9) {
        carry = 1;
      } else {
        carry = 0;
      }
      sum %= 10;
      ListNode temp = new ListNode(sum);
      temp.next = head;
      head = temp;
    }
    while (!list1.isEmpty()) {
      int sum = carry + list1.pop().val;
      if (sum > 9) {
        carry = 1;
      } else {
        carry = 0;
      }
      sum %= 10;
      ListNode temp = new ListNode(sum);
      temp.next = head;
      head = temp;
    }
    while (!list2.isEmpty()) {
      int sum = carry + list2.pop().val;
      if (sum > 9) {
        carry = 1;
      } else {
        carry = 0;
      }
      sum %= 10;
      ListNode temp = new ListNode(sum);
      temp.next = head;
      head = temp;
    }
    if (carry > 0) {
      ListNode temp = new ListNode(carry);
      temp.next = head;
      head = temp;
    }
    return head;
  }

  public ListNode addTwoNumbersByReversingInputs(ListNode l1, ListNode l2) {
    l1 = reverseList(l1);
    l2 = reverseList(l2);
    int carry = 0;
    ListNode head = new ListNode(-1);
    ListNode result = head;
    while (l1 != null && l2 != null) {
      int val = l1.val + l2.val + carry;
      head.next = new ListNode(val % 10);
      head = head.next;
      carry = val / 10;
      l1 = l1.next;
      l2 = l2.next;
    }

    while (l1 != null) {
      int val = l1.val + carry;
      head.next = new ListNode(val % 10);
      head = head.next;
      carry = val / 10;
      l1 = l1.next;
    }

    while (l2 != null) {
      int val = l2.val + carry;
      head.next = new ListNode(val % 10);
      head = head.next;
      carry = val / 10;
      l2 = l2.next;
    }

    if (carry > 0) {
      head.next = new ListNode(carry);
    }
    ListNode temp = result;
    result = result.next;
    temp.next = null;
    return reverseList(result);
  }

  private ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    return prev;
  }
}
