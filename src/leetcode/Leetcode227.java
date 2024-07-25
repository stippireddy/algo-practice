package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Leetcode227 {
    public int calculate(String s) {
        List<String> tokens = tokenize(s);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String sign = "+";
        for(String token : tokens) {
            if(Character.isDigit(token.charAt(0))) {
                if(sign.equals("+")) {
                    stack.push(Integer.parseInt(token));
                } else if(sign.equals("-")) {
                    stack.push(-Integer.parseInt(token));
                } else if(sign.equals("*")) {
                    int a = stack.pop();
                    stack.push(a * Integer.parseInt(token));
                } else {
                    int a = stack.pop();
                    stack.push(a / Integer.parseInt(token));
                }
            } else{
                sign = token;
            }
        }
        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    private List<String> tokenize(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return result;
        }
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            if (Character.isDigit(s.charAt(i))) {
                int j = i;
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    j++;
                }
                result.add(s.substring(i, j));
            } else {
                result.add(s.substring(i, 1));
            }
        }
        return result;
    }
}
