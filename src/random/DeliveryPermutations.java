package random;

import java.util.*;

public class DeliveryPermutations {
    public static List<String> getPermutations(int n) {
        Set<String> open = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            open.add("P" + i);
        }
        Set<String> close = new HashSet<>();
        LinkedList<String> result = new LinkedList<>();
        helper(new LinkedList<>(), open, close, n, result);
        return result;
    }

    private static void helper(LinkedList<String> subResult, Set<String> open, Set<String> close, int n, LinkedList<String> result) {
        if (subResult.size() == 2 * n) {
            String r = "";
            for (String s : subResult) {
                r = r + s + " ,";
            }
            result.add(r);
            return;
        }
        Set<String> tempOpen = new HashSet<>(open);
        for (String s : tempOpen) {
            subResult.addLast(s);
            String newClose = "D" + s.substring(1);
            open.remove(s);
            close.add(newClose);
            helper(subResult, open, close, n, result);
            open.add(s);
            close.remove(newClose);
            subResult.removeLast();
        }
        Set<String> tempClose = new HashSet<>(close);
        for (String s : tempClose) {
            subResult.addLast(s);
            close.remove(s);
            helper(subResult, open, close, n, result);
            close.add(s);
            subResult.removeLast();
        }
    }

    public static void main(String[] args) {
        List<String> result = getPermutations(5);
        System.out.println(result.size());
    }
}
