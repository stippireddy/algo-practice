package karumanchi.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class TreeUtils {

  public static List<Integer> preOrderRecursive(TreeNode root) {
    if (root == null) {
      return null;
    }
    ArrayList<Integer> result = new ArrayList<>();
    preOrderRecursive(root, result);
    return result;
  }

  private static void preOrderRecursive(TreeNode node, ArrayList<Integer> result) {
    if (node == null) {
      return;
    }
    result.add(node.getVal());
    preOrderRecursive(node.getLeft(), result);
    preOrderRecursive(node.getRight(), result);
  }

  public static List<Integer> postOrderRecursive(TreeNode root) {
    if (root == null) {
      return null;
    }
    ArrayList<Integer> result = new ArrayList<>();
    postOrderRecursive(root, result);
    return result;
  }

  private static void postOrderRecursive(TreeNode node, ArrayList<Integer> result) {
    if (node == null) {
      return;
    }
    postOrderRecursive(node.getLeft(), result);
    postOrderRecursive(node.getRight(), result);
    result.add(node.getVal());
  }

  public static List<Integer> inOrderRecursive(TreeNode root) {
    if (root == null) {
      return null;
    }
    ArrayList<Integer> result = new ArrayList<>();
    inOrderRecursive(root, result);
    return result;
  }

  private static void inOrderRecursive(TreeNode node, ArrayList<Integer> result) {
    if (node == null) {
      return;
    }
    inOrderRecursive(node.getLeft(), result);
    result.add(node.getVal());
    inOrderRecursive(node.getRight(), result);
  }

  public static void levelOrder(TreeNode head) {
    if (head == null) {
      return;
    }
    StringBuffer s = new StringBuffer();
    Queue<TreeNode> q = new ArrayDeque<TreeNode>();
    q.add(head);
    while (!q.isEmpty()) {
      TreeNode node = q.poll();
      if (node.getLeft() != null) {
        q.add(node.getLeft());
      }
      if (node.getRight() != null) {
        q.add(node.getRight());
      }
      s.append(node.getVal() + ", ");
    }
    System.out.print(s.substring(0, s.length() - 2));
  }

  public static void reverseLevelOrder(TreeNode head) {
    if (head == null) {
      return;
    }
    StringBuffer s = new StringBuffer();
    Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
    Queue<TreeNode> q = new ArrayDeque<TreeNode>();
    q.add(head);
    while (!q.isEmpty()) {
      TreeNode node = q.poll();
      if (node.getRight() != null) {
        q.add(node.getRight());
      }
      if (node.getLeft() != null) {
        q.add(node.getLeft());
      }
      stack.push(node);
    }
    while (!stack.isEmpty()) {
      s.append(stack.pop().getVal() + ", ");
    }
    System.out.print(s.substring(0, s.length() - 2));
  }

  public static TreeNode createTree(Integer[] input) {
    int inputLength = input.length;
    if (input == null || inputLength == 0) {
      return null;
    }
    TreeNode[] tree = new TreeNode[inputLength];
    for (int i = 0; i < inputLength; i++) {
      if (input[i] != null) {
        tree[i] = new TreeNode(input[i]);
      } else {
        tree[i] = null;
      }
    }
    //[1,2,null,null,3,4]
    int i = 0;
    int j = 1;
    while (i < inputLength && j < inputLength) {
      if (tree[i] != null) {
        tree[i].setLeft(tree[j++]);
        if (j < inputLength) {
          tree[i].setRight(tree[j++]);
        }
      }
      i++;
    }
    return tree[0];
  }

  public static ArrayList<Integer> preOrder(TreeNode root) {
    if (root == null) {
      return null;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    ArrayList<Integer> result = new ArrayList<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode temp = stack.pop();
      result.add(temp.getVal());
      if (temp.getRight() != null) {
        stack.push(temp.getRight());
      }
      if (temp.getLeft() != null) {
        stack.push(temp.getLeft());
      }
    }
    return result;
  }

  public static ArrayList<Integer> inOrder(TreeNode root) {
    if (root == null) {
      return null;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    ArrayList<Integer> result = new ArrayList<>();
    while (root != null || !stack.isEmpty()) {
      if (root != null) {
        stack.push(root);
        root = root.getLeft();
      } else {
        TreeNode temp = stack.pop();
        result.add(temp.getVal());
        if (temp.getRight() != null) {
          root = temp.getRight();
        }
      }
    }
    return result;
  }

  public static ArrayList<Integer> postOrder(TreeNode root) {
    if (root == null) {
      return null;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    ArrayList<Integer> result = new ArrayList<>();
    TreeNode curr = root;
    while (curr != null || !stack.isEmpty()) {
      if (curr != null) {
        stack.push(curr);
        curr = curr.getLeft();
      } else {
        TreeNode temp = stack.peek().getRight();
        if (temp == null) {
          do {
            temp = stack.pop();
            result.add(temp.val);
          } while (!stack.isEmpty() && stack.peek().getRight() == temp);
        } else {
          curr = temp;
        }
      }
    }
    return result;
  }
}
