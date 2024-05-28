package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode451 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }
        Map<Integer, List<Character>> freq = new HashMap<>();
        int maxFrequency = 0;
        for (char c : map.keySet()) {
            int frequency = map.get(c);
            maxFrequency = Integer.max(maxFrequency, frequency);
            freq.putIfAbsent(frequency, new ArrayList<>());
            freq.get(frequency).add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = maxFrequency; i > 0; i--) {
            if (freq.containsKey(i)) {
                for (char c : freq.get(i)) {
                    int j = i;
                    while (j-- > 0) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
