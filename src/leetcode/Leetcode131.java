package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        partition(s, 0, result, new ArrayList<>());
        return result;
    }

    private void partition(String s, int index, List<List<String>> result, ArrayList<String> subResult) {
        if (index == s.length()) {
            result.add(new ArrayList<>(subResult));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                subResult.add(s.substring(index, i + 1));
                partition(s, i + 1, result, subResult);
                subResult.remove(subResult.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
