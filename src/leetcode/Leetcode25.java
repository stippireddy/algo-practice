package leetcode;

public class Leetcode25 {
    public ListNode reverseLinkedList(ListNode head, int k) {
        // Reverse k nodes of the given linked list.
        // This function assumes that the list contains
        // atleast k nodes.
        ListNode result = null;
        ListNode temp = head;

        while (k > 0) {
            // Keep track of the next node to process in the
            // original list
            ListNode nextNode = temp.next;

            // Insert the node pointed to by "temp"
            // at the beginning of the reversed list
            temp.next = result;
            result = temp;

            // Move on to the next node
            temp = nextNode;

            // Decrement the count of nodes to be reversed by 1
            k--;
        }

        // Return the head of the reversed list
        return result;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode tail = null;

        // Head of the final, moified linked list
        ListNode newHead = null;

        // Keep going until there are nodes in the list
        while (temp != null) {
            int count = 0;

            // Start counting nodes from the head
            temp = head;

            // Find the head of the next k nodes
            while (count < k && temp != null) {
                temp = temp.next;
                count += 1;
            }

            // If we counted k nodes, reverse them
            if (count == k) {
                // Reverse k nodes and get the new head
                ListNode revHead = this.reverseLinkedList(head, k);

                // newHead is the head of the final linked list
                if (newHead == null) newHead = revHead;

                // tail is the tail of the previous block of
                // reversed k nodes
                if (tail != null) tail.next = revHead;

                tail = head;
                head = temp;
            }
        }

        // attach the final, possibly un-reversed portion
        if (tail != null) tail.next = head;

        return newHead == null ? head : newHead;
    }
}
