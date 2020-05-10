package karumanchi.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindSize {

  public static void main(String[] args) {
    TreeNode t7 = new TreeNode(7, null, null);
    TreeNode t6 = new TreeNode(6, null, null);
    TreeNode t5 = new TreeNode(5, null, null);
    TreeNode t4 = new TreeNode(4, null, null);
    TreeNode t3 = new TreeNode(3, t6, t7);
    TreeNode t2 = new TreeNode(2, t4, t5);
    TreeNode t1 = new TreeNode(1, t2, t3);
    FindSize i = new FindSize();
    System.out.println(i.getSizeRecursively(t1));
    System.out.println(i.getSizeIteratively(t1));
    System.out.println(i.getSizeRecursively(null));
    System.out.println(i.getSizeIteratively(null));

  }

  public int getSizeRecursively(TreeNode head) {
    int size = 0;
    if (head != null) {
      size = 1 + getSizeRecursively(head.getLeft()) + getSizeRecursively(head.getRight());
    }
    return size;
  }

  public int getSizeIteratively(TreeNode head) {
    int size = 0;
    if (head != null) {
      Queue<TreeNode> q = new ArrayDeque<>();
      q.add(head);
      while (!q.isEmpty()) {
        head = q.poll();
        size++;
        if (head.getLeft() != null) {
          q.add(head.getLeft());
        }
        if (head.getRight() != null) {
          q.add(head.getRight());
        }
      }
    }
    return size;
  }
}
