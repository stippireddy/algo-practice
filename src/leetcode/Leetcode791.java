package leetcode;

public class Leetcode791 {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : order.toCharArray()) {
            while (freq[c - 'a'] > 0) {
                freq[c - 'a']--;
                sb.append(c);
            }
        }
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                freq[i]--;
                sb.append('a' + i);
            }
        }
        return sb.toString();
    }
}
