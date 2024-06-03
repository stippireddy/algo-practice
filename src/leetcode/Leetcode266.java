package leetcode;

public class Leetcode266 {
    public boolean canPermutePalindrome(String s) {
        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        boolean hasFoundOddAlready = false;
        for (int i : frequency) {
            if (i % 2 != 0) {
                if (hasFoundOddAlready) {
                    return false;
                }
                hasFoundOddAlready = true;
            }
        }
        return true;
    }
}
