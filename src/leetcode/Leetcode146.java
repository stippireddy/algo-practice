/**
 * Created by Sarveswara Tippireddy on Jul 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/lru-cache/description/
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode146 {
    class LRUCache {

        private int capacity;
        private Map<Integer, Node> map;
        private Node head;
        private Node tail;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new HashMap<>();
            this.head = new Node(-1, -1);
            this.tail = new Node(-1, -1);
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if (!map.containsKey(key)) {
                return -1;
            }
            Node current = map.get(key);
            current.prev.next = current.next;
            current.next.prev = current.prev;
            tail.prev.next = current;
            current.prev = tail.prev;
            current.next = tail;
            tail.prev = current;
            return current.value;
        }

        public void put(int key, int value) {
            Node current = null;
            if (map.containsKey(key)) {
                current = map.get(key);
                current.value = value;
                current.prev.next = current.next;
                current.next.prev = current.prev;
            } else {
                current = new Node(key, value);
                map.put(key, current);
                if (map.keySet().size() > capacity) {
                    Node nodeToBeRemoved = head.next;
                    head.next = nodeToBeRemoved.next;
                    nodeToBeRemoved.next.prev = head;
                    map.remove(nodeToBeRemoved.key);
                }
            }
            tail.prev.next = current;
            current.prev = tail.prev;
            current.next = tail;
            tail.prev = current;
        }
    }

    private class Node {
        private int key;
        private int value;
        private Node next;
        private Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
