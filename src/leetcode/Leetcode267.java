package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode267 {
    public List<String> generatePalindromes(String s) {
        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        boolean hasFoundOddAlready = false;
        String start = "";
        for (int i = 0; i < 26; i++) {
            if (frequency[i] % 2 != 0) {
                if (hasFoundOddAlready) {
                    return new ArrayList<>();
                }
                hasFoundOddAlready = true;
                start = "" + (char) ('a' + i);
                frequency[i]--;
            }
        }
        List<String> result = new ArrayList<>();
        permute(s.length(), frequency, result, start);
        return result;
    }

    private void permute(int length, int[] frequency, List<String> result, String subResult) {
        if (subResult.length() == length) {
            result.add(subResult);
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                char c = (char) ('a' + i);
                frequency[i] = frequency[i] - 2;
                permute(length, frequency, result, c + subResult + c);
                frequency[i] = frequency[i] + 2;
            }
        }
    }
}
