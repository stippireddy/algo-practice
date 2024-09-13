/**
 * Created by Sarveswara Tippireddy on Sep 1, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/complex-number-multiplication/description/
 */
package leetcode;

import java.util.ArrayDeque;

public class Leetcode536 {

    public TreeNode str2tree(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        ArrayDeque<String> q = splitString(s);
        return str2tree(q);
    }

    private ArrayDeque<String> splitString(String s) {
        ArrayDeque<String> q = new ArrayDeque<>();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                q.add("(");
                i++;
            } else if (s.charAt(i) == ')') {
                q.add(")");
                i++;
            } else {
                int j = i + 1;
                while (j < s.length() && (s.charAt(j) != '(' && s.charAt(j) != ')')) {
                    j++;
                }
                q.add(s.substring(i, j));
                i = j;
            }
        }
        return q;
    }

    public TreeNode str2tree(ArrayDeque<String> q) {
        if (q.isEmpty()) {
            return null;
        }
        String current = q.poll();
        if (current.equals(")")) {
            return null;
        }
        // 4(2(3)(1))(6(5)(7))
        TreeNode root = new TreeNode(Integer.parseInt(current));
        if (!q.isEmpty() && q.peek().equals("(")) {
            q.poll();
            root.left = str2tree(q);
        }
        if (!q.isEmpty() && q.peek().equals("(")) {
            q.poll();
            root.right = str2tree(q);
        }
        return root;
    }

    public static void main(String[] args) {
        Leetcode536 l = new Leetcode536();
        l.str2tree("4(2(3)(1))(6(5)(7))");
    }
}
