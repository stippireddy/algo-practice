package leetcode;

public class Leetcode708 {
    /*
        Talk about these tests:
            [1,3,5] insert 3
            [3,5,1] insert 6
            [3,3,5] insert 0
    */
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node temp = new Node(insertVal);
            temp.next = temp;
            return temp;
        }
        Node node = head;
        while (node.next != head) {
            if (node.val <= node.next.val) {
                if (insertVal >= node.val && insertVal <= node.next.val) {
                    break;
                }
            } else {
                if (insertVal >= node.val || insertVal <= node.next.val) {
                    break;
                }
            }
            node = node.next;
        }
        Node temp = node.next;
        node.next = new Node(insertVal);
        node.next.next = temp;
        return head;
    }


    class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }
}