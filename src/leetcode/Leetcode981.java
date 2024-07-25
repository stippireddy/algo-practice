package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Leetcode981 {
    class TimeMap {

        Map<String, TreeMap<Integer, String>> map;

        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            map.putIfAbsent(key, new TreeMap<>());
            map.get(key).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            if (!map.containsKey(key)) {
                return null;
            }
            Map.Entry<Integer, String> entry = map.get(key).floorEntry(timestamp);
            return entry == null ? null : entry.getValue();
        }
    }
}
