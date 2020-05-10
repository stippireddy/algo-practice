package karumanchi.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindMaximum {

  public static void main(String[] args) {
    TreeNode t7 = new TreeNode(7, null, null);
    TreeNode t6 = new TreeNode(6, null, null);
    TreeNode t5 = new TreeNode(5, null, null);
    TreeNode t4 = new TreeNode(4, null, null);
    TreeNode t3 = new TreeNode(3, t6, t7);
    TreeNode t2 = new TreeNode(2, t4, t5);
    TreeNode t1 = new TreeNode(1, t2, t3);
    FindMaximum f = new FindMaximum();
    System.out.println(f.findMaxIteratively(t1));
  }

  public int findMaxRecursively(TreeNode head) {
    int max = Integer.MIN_VALUE;
    if (head != null) {
      max = getMax(head.getVal(), findMaxRecursively(head.getLeft()),
          findMaxRecursively(head.getRight()));
    }
    return max;
  }

  public int findMaxIteratively(TreeNode head) {
    int max = Integer.MIN_VALUE;
    if (head != null) {
      Queue<TreeNode> q = new ArrayDeque<>();
      q.add(head);
      while (!q.isEmpty()) {
        head = q.poll();
        if (head.getLeft() != null) {
          q.add(head.getLeft());
        }
        if (head.getRight() != null) {
          q.add(head.getRight());
        }
        if (head.getVal() > max) {
          max = head.getVal();
        }
      }
    }
    return max;
  }

  private int getMax(int a, int b, int c) {
    if (a > b) {
      if (a > c) {
        return a;
      } else {
        return c;
      }
    } else {
      if (b > c) {
        return b;
      } else {
        return c;
      }
    }
  }
}
