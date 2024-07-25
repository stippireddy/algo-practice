package leetcode;

import java.util.PriorityQueue;

public class Leetcode767 {
    /*
        Use a max pq to store the characters
        if(maxFrequent char is greater than half the length + 1 return ""
        get most frequency character from pq
        if(last polled char != current char), append to sb and readd to pq if freq > 0
        else get the second most freq char, append to sb and reaad to pq is freq > 0
            don't forget to add the most freq char back
     */
    public String reorganizeStringUsingHeap(String s) {
        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> Integer.compare(frequency[b - 'a'], frequency[a - 'a']));
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                pq.add((char) ('a' + i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            sb.append(c);
            frequency[c - 'a']--;
            if (frequency[c - 'a'] > 0) {
                pq.add(c);
            }
        }
        return sb.toString();
    }

    public String reorganizeString(String s) {
        int[] frequency = new int[26];
        int maxFrequency = 0;
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
            maxFrequency = Integer.max(maxFrequency, frequency[c - 'a']);
        }
        if ((s.length() + 1) / 2 < maxFrequency) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] result = new char[s.length()];
        int i = 0;
        while (i < s.length()) {
            char c = mostFrequentChar(frequency);
            while (i < s.length() && frequency[c - 'a'] > 0) {
                frequency[c - 'a']--;
                result[i] = c;
                i += 2;
            }
        }
        i = 1;
        while (i < s.length()) {
            char c = mostFrequentChar(frequency);
            while (i < s.length() && frequency[c - 'a'] > 0) {
                frequency[c - 'a']--;
                result[i] = c;
                i += 2;
            }
        }
        return String.valueOf(result);
    }

    private char mostFrequentChar(int[] frequency) {
        char c = ' ';
        int maxFrequency = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (maxFrequency < frequency[i]) {
                c = (char) ('a' + i);
                maxFrequency = frequency[i];
            }
        }
        return c;
    }
}
