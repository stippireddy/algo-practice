package xis;

import java.util.LinkedList;

public class LeetCode791 {

  public String customSortString(String order, String s) {
    int[] frequencyArray = new int[26];
    for (char c : s.toCharArray()) {
      frequencyArray[c - 'a']++;
    }
    char[] result = new char[s.length()];
    int i = 0;
    for (char c : order.toCharArray()) {
      while (frequencyArray[c - 'a'] > 0) {
        result[i] = c;
        i++;
        frequencyArray[c - 'a']--;
      }
    }
    for (int j = 0; j < 26; j++) {
      while (frequencyArray[j] > 0) {
        result[i] = (char) ('a' + j);
        i++;
        frequencyArray[j]--;
      }
    }
    return String.valueOf(result);
  }

  public ListNode mergeKLists(ListNode[] lists) {
    ListNode result = new ListNode();
    ListNode temp = result;
    LinkedList<ListNode> linkedList = new LinkedList<>();
    for (ListNode ln : lists) {
      linkedList.add(ln);
    }
    while (!linkedList.isEmpty()) {
      ListNode min = linkedList.getFirst();
    }
    return temp.next;
  }
}

class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}