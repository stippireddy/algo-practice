package leetcode;

public class LeetCode953 {
    public boolean isAlienSorted(String[] words, String order) {
        int[] indices = new int[26];
        for (int i = 0; i < order.length(); i++) {
            indices[order.charAt(i) - 'a'] = i;
        }
        int minLength = Integer.MAX_VALUE;
        for (String word : words) {
            minLength = Integer.min(minLength, word.length());
        }

        for (int index = 0; index < words.length - 1; index++) {
            String word1 = words[index];
            String word2 = words[index + 1];
            int i = 0, j = 0;
            while (i < word1.length() && j < word2.length() && word1.charAt(i) == word2.charAt(j)) {
                i++;
                j++;
            }
            // This is to handle the case of apple, app
            if (j == word2.length() && i < word1.length()) {
                return false;
            }
            if (i < word1.length() && j < word2.length() && indices[word1.charAt(i) - 'a'] > indices[word2.charAt(j) - 'a']) {
                return false;
            }
        }
        return true;
    }
}
