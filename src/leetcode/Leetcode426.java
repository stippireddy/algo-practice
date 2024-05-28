package leetcode;

public class Leetcode426 {

    Node first;
    Node last;

    public Node treeToDoublyList(Node root) {
        inOrder(root);
        if (first == null) {
            return null;
        }
        first.left = last;
        last.right = first;
        return first;
    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (first == null) {
            first = root;
        }
        if(last != null) {
            last.right = root;
        }
        root.left = last;
        last = root;
        inOrder(root.right);
    }

    private static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}
