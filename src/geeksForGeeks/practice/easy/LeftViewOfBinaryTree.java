/**
 * Created by Sarveswara Tippireddy on Oct 25, 2017
 *
 * <p>
 * This GeeksForGeeks problem can be found @
 * http://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
 *
 * <p>
 * The solution editorial can be found @ 
 * http://www.geeksforgeeks.org/print-left-view-binary-tree/
 */
package geeksForGeeks.practice.easy;

import java.util.HashMap;
import java.util.Scanner;

// A Binary Tree node
class Node {
  int data;
  Node left, right;

  Node(int item) {
    data = item;
    left = right = null;
  }
}


class LeftViewOfBinaryTree {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    // Node root=null;
    while (t > 0) {
      HashMap<Integer, Node> m = new HashMap<Integer, Node>();
      int n = sc.nextInt();
      Node root = null;
      while (n > 0) {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char lr = sc.next().charAt(0);
        Node parent = m.get(n1);
        if (parent == null) {
          parent = new Node(n1);
          m.put(n1, parent);
          if (root == null)
            root = parent;
        }
        Node child = new Node(n2);
        if (lr == 'L')
          parent.left = child;
        else
          parent.right = child;
        m.put(n2, child);
        n--;
      }
      GfG g = new GfG();
      g.leftView(root);
      System.out.println();
      t--;
    }
  }
}


class GfG {
  void leftView(Node root) {
    StringBuffer sb = new StringBuffer();
    HashMap<Integer, Node> map = new HashMap<>();
    int length = 0;
    helper(root, sb, map, length);
    if (sb.length() > 0) {
      System.out.print(sb.substring(0, sb.length() - 1));
    }
  }

  private void helper(Node root, StringBuffer sb, HashMap<Integer, Node> map, int length) {
    if (root == null) {
      return;
    }
    if (!map.containsKey(length)) {
      map.put(length, root);
      sb.append(root.data).append(" ");
    }
    helper(root.left, sb, map, length + 1);
    helper(root.right, sb, map, length + 1);
  }
}
