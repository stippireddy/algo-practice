package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode347 {

  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> frequency = new HashMap<>();
    for (int num : nums) {
      frequency.put(num, frequency.getOrDefault(num, 0) + 1);
    }
    List<Integer>[] frequencyList = new List[nums.length + 1];
    for (int i = 0; i < frequencyList.length; i++) {
      frequencyList[i] = new ArrayList<>();
    }
    for (int key : frequency.keySet()) {
      frequencyList[frequency.get(key)].add(key);
    }

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = frequencyList.length - 1; i >= 0 && list.size() < k; i--) {
      list.addAll(frequencyList[i]);
    }
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = list.get(i);
    }
    return result;
  }
}
