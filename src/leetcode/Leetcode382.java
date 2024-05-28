package leetcode;

import java.util.Random;

public class Leetcode382 {
    private class Solution {

        private ListNode head;

        private Random r;

        public Solution(ListNode head) {
            this.head = head;
            r = new Random();
        }

        public int getRandom() {
            int result = -1;
            int size = 1;
            ListNode temp = head;
            while (temp != null) {
                if (r.nextInt(size++) == 0) {
                    result = temp.val;
                }
                temp = temp.next;
            }
            return result;
        }

        private class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
            }
        }
    }
}

