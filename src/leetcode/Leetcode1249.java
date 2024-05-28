package leetcode;

import java.util.ArrayDeque;

public class Leetcode1249 {
    public String minRemoveToMakeValid(String s) {
        ArrayDeque<Character> q = new ArrayDeque<>();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0) {
                    continue;
                }
                open--;
            }
            q.addLast(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            char c = q.pollLast();
            if (c == '(' && open > 0) {
                open--;
            } else {
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }
}
