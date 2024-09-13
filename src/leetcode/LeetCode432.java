//package leetcode;
//
//import java.util.*;
//
//public class LeetCode432 {
//    class AllOne {
//        Map<String, Node> countMap;
//        TreeSet<Node> sortedSet;
//
//        public AllOne() {
//            countMap = new HashMap<>();
//            sortedSet = new TreeSet<>(Comparator.comparingInt(a -> a.count));
//        }
//
//        public void inc(String key) {
//            countMap.putIfAbsent(key, new Node(key, 0));
//            Node n = countMap.get(key);
//            sortedSet.remove(n);
//        }
//
//        public void dec(String key) {
//
//        }
//
//        public String getMaxKey() {
//
//        }
//
//        public String getMinKey() {
//
//        }
//    }
//
//    class Node {
//        private String key;
//        private int count;
//
//        Node(String key, int count) {
//            this.key = key;
//            this.count = count;
//        }
//    }
//}