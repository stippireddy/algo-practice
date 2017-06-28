package leetCode;

public class ListNode {

  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  @Override
  public boolean equals(Object obj) {
    ListNode other = (ListNode) obj;
    if (this.next == null && other.next == null) {
      return true;
    } else if (this.next == null && other.next != null) {
      return false;
    } else if (this.next != null && other.next == null) {
      return false;
    } else if (this.val != other.val) {
      return false;
    }
    return true;
  }
}
