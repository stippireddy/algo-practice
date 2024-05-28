package leetcode;

import java.util.*;

public class Leetcode347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : nums) {
            frequencyMap.putIfAbsent(i, 0);
            frequencyMap.put(i, frequencyMap.get(i) + 1);
        }
        int maxFrequency = Collections.max(frequencyMap.values());
        List<Integer>[] buckets = new List[maxFrequency + 1];
        for (int i = 0; i < maxFrequency + 1; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int key : frequencyMap.keySet()) {
            buckets[frequencyMap.get(key)].add(key);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = maxFrequency; i > 0; i--) {
            if (k > 0) {
                result.addAll(buckets[i]);
                k -= buckets[i].size();
            }
        }
        int[] resultArray = new int[result.size()];
        for(int i = 0; i< resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
