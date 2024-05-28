package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode249 {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            int rotation = 'z' - s.charAt(0) + 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append(rotate(s.charAt(i), rotation));
            }
            String rotatedString = sb.toString();
            map.putIfAbsent(rotatedString, new ArrayList<>());
            map.get(rotatedString).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private char rotate(char c, int rotation) {
        return (char) ('a' + (c - 'a' + rotation) % 26);
    }
}

