package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Leetcode1209 {
    public String removeDuplicates(String s, int k) {
        ArrayDeque<CharacterCount> q = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (q.isEmpty()) {
                q.addLast(new CharacterCount(c));
            } else {
                if (q.peekLast().c == c) {
                    if (q.peekLast().count == k - 1) {
                        q.removeLast();
                    } else {
                        q.peekLast().count++;
                    }
                } else {
                    q.addLast(new CharacterCount(c));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            CharacterCount pojo = q.pollFirst();
            while (pojo.count > 0) {
                sb.append(pojo.c);
                pojo.count--;
            }
        }
        return sb.toString();
    }

    class CharacterCount {
        private char c;
        private int count;

        CharacterCount(char c) {
            this.c = c;
            this.count = 1;
        }
    }
}
