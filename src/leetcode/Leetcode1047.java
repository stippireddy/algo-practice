package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

public class Leetcode1047 {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> q = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!q.isEmpty() && q.peekLast() == c) {
                q.pollLast();
            } else {
                q.offerLast(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            sb.append(q.pollFirst());
        }
        return sb.toString();
    }
}
