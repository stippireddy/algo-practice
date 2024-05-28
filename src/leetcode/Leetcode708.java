package leetcode;

//TODO
public class Leetcode708 {
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node temp = new Node(insertVal);
            temp.next = temp;
            return temp;
        }
        if (head.next == head) {
            Node temp = new Node(insertVal);
            head.next = temp;
            temp.next = head;
            return head;
        }
        Node temp = head;
        while (temp.next.val >= temp.val) {
            temp = temp.next;
        }
        while(temp.next.val > insertVal) {
            temp = temp.next;
        }
        Node newNode = new Node(insertVal);
        newNode.next = temp.next;
        temp.next = newNode;
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