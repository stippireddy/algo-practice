package leetCode;

public class LeetCode23 {
  public ListNode mergeKListsIterative(ListNode[] lists) {
    ListNode temp = new ListNode(-1);
    ListNode result = temp;
    while (true) {
      int min = -1;
      int nullCount = 0;
      for (int i = 0; i < lists.length - 1; i++) {
        if (lists[i] != null) {
          if (lists[i].val < lists[i + 1].val) {
            min = i;
          } else {
            min = i + 1;
          }
        } else {
          nullCount++;
        }
      }
      if (nullCount == lists.length) {
        break;
      }
      temp.next = lists[min];
      temp = temp.next;
      lists[min] = lists[min].next;
    }
    return result.next;
  }
  
  public ListNode mergeKListsRecursive(ListNode[] lists) {}
}
