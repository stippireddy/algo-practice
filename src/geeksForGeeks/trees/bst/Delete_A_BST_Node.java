package geeksForGeeks.trees.bst;

import java.util.Scanner;

class Node {
  int key;
  Node left, right;

  Node(int item) {
    key = item;
    left = right = null;
  }
}

public class Delete_A_BST_Node {
  Node root;

  void insert(Node root, int key) {
    if (key < root.key) { //System.out.print(root.key);
      if (root.left != null) insert(root.left, key);
      else {
        root.left = new Node(key);
      }
      //root = root.left;
      //insert(root.left,key);
    } else if (key > root.key) {
      //System.out.print(root.key);
      if (root.right != null) insert(root.right, key);
      else {
        root.right = new Node(key);
      }
    }
  }

  void inorder(Node node) {
    if (node == null) return;
    else inorder(node.left);
    System.out.print(node.key + " ");
    inorder(node.right);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      Delete_A_BST_Node tree = new Delete_A_BST_Node();
      //GfG g = new GfG();
      int a1 = sc.nextInt();
      Node root = new Node(a1);
      for (int i = 1; i < n; i++) {
        int a = sc.nextInt();
        tree.insert(root, a);
      }
      int n1 = sc.nextInt();
      GfG g = new GfG();
      Node s = g.deleteNode(root, n1);
      tree.inorder(s);
      System.out.println();
      t--;
    }
  }
}
/* class Node
{
    int key;
    Node left, right;

    Node(int item)
    {
        key = item;
        left = right = null;
    }
}*/
class GfG {
  Node deleteNode(Node root, int key) {
    if (root == null) {
      return root;
    }
    Node nodeToBeReturned = root;
    Node prev = null;
    boolean isLeft = false;
    boolean isRight = false;
    while (root != null && root.key != key) {
      prev = root;
      if (key < root.key) {
        isLeft = true;
        root = root.left;
      } else if (root.key < key) {
        isRight = true;
        root = root.right;
      }
    }
    if (root.left == null && root.right == null) {
      if (prev == null) {
        return null;
      } else {
        if (isLeft) {
          prev.left = null;
        } else if (isRight) {
          prev.right = null;
        }
      }
    } else if (root.left == null) {
      if (prev == null) {
        return root.right;
      } else {
        if (isLeft) {
          prev.left = root.right;
        } else if (isRight) {
          prev.right = root.right;
        }
      }
    } else if (root.right == null) {
      if (prev == null) {
        return root.left;
      }
      if (isLeft) {
        prev.left = root.left;
      } else if (isRight) {
        prev.right = root.left;
      }
    } else {

      Node succPrev = root;
      Node successor = root.right;
      while (successor.left != null) {
        succPrev = successor;
        successor = successor.left;
      }
      root.key = successor.key;
      if (succPrev.right.key == successor.key) {
        if (prev == null) {
          root.right = successor.right;
        } else {
          prev.right = successor.right;
        }
      } else {
        succPrev.left = successor.right;
      }
    }
    return nodeToBeReturned;
  }
}
