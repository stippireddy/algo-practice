package leetcode;

import java.util.ArrayDeque;

public class LeetCode071 {

    public String simplifyPath(String path) {
        String[] splitPath = path.split("/");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String split : splitPath) {
            if (split.equals("") || split.equals(".")) {
                continue;
            }
            if (split.equals("..")) {
                if (stack.isEmpty()) {
                    continue;
                }
                stack.pop();
            } else {
                stack.push(split);
            }
        }
        String result = "/";
        int size = stack.size();
        while (size > 1) {
            result = result + stack.pollLast() + "/";
            size--;
        }
        if (size == 1) {
            result += stack.pollLast();
        }
        return result;
    }
}
