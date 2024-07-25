package leetcode;

import java.util.Arrays;

public class Leetcode616 {
    public String addBoldTag(String s, String[] words) {
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return s;
        }
        boolean[] bold = new boolean[s.length()];
        for (String word : words) {
            mark(s, word, bold);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (bold[i] && (i == 0 || !bold[i - 1])) {
                sb.append("<b>");
            }
            sb.append(s.charAt(i));
            if (bold[i] && (i == s.length() - 1 || !bold[i + 1])) {
                sb.append("</b>");
            }
        }
        return sb.toString();
    }

    private void mark(String s, String word, boolean[] marked) {
        for (int i = 0; i <= s.length() - word.length(); i++) {
            String subString = s.substring(i, i + word.length());
            if (word.equals(subString)) {
                Arrays.fill(marked, i, i + word.length(), true);
            }
        }
    }
}
