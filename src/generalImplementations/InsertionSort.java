package generalImplementations;

import leetCode.ListNode;

public class InsertionSort {

  public static void sort(int[] a) {
    for (int i = 1; i < a.length; i++) {
      int key = a[i];
      int j = i - 1;
      while (j >= 0 && a[j] > key) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;
    }
  }

  public static ListNode sort(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode result = new ListNode(Integer.MIN_VALUE);

    while (head != null) {
      ListNode t = head;
      head = head.next;
      ListNode iterator = result;
      while (iterator.next != null && iterator.next.val < t.val) {
        iterator = iterator.next;
      }
      t.next = iterator.next;
      iterator.next = t;
    }
    return result.next;
  }
}
