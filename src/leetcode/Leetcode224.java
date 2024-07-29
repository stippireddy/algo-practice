package leetcode;

import java.util.ArrayDeque;

public class Leetcode224 {
    public int calculate(String s) {
        ArrayDeque<String> q = tokenize(s);
        return evaluate(q);
    }

    private int evaluate(ArrayDeque<String> q) {
        if (q.isEmpty()) {
            return 0;
        }
        int result = 0;
        String sign = "+";
        while (!q.isEmpty()) {
            String s = q.poll();
            if (s.equals("(")) {
                if (sign.equals("+")) {
                    result += evaluate(q);
                } else {
                    result -= evaluate(q);
                }
            } else if (s.equals(")")) {
                return result;
            } else if (Character.isDigit(s.charAt(0))) {
                if (sign.equals("+")) {
                    result += Integer.parseInt(s);
                } else {
                    result -= Integer.parseInt(s);
                }
            } else {
                sign = s;
            }
        }
        return result;
    }

    private ArrayDeque<String> tokenize(String s) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == ' ') {
                i++;
                continue;
            }
            if (c == '(' || c == ')' || c == '+' || c == '-') {
                queue.add("" + c);
                i++;
            } else {
                int j = i;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    i++;
                }
                queue.add(s.substring(j, i));
            }
        }
        return queue;
    }
}
