package leetcode;

import java.util.*;

public class Leetcode381 {
    class RandomizedCollection {

        private Map<Integer, Set<Integer>> map;

        private List<Integer> list;

        Random r;

        public RandomizedCollection() {
            map = new HashMap<>();
            list = new ArrayList<>();
            r = new Random();
        }

        public boolean insert(int val) {
            boolean result = !(map.containsKey(val) && !map.get(val).isEmpty());
            map.putIfAbsent(val, new HashSet<>());
            map.get(val).add(list.size());
            list.add(val);
            return result;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val) || map.get(val).isEmpty()) {
                return false;
            }
            Set<Integer> indices = map.get(val);
            int index = indices.iterator().next();

            int swapVal = list.get(list.size() - 1);

            list.set(index, swapVal);
            map.get(val).remove(index);
            map.get(swapVal).add(index);
            map.get(swapVal).remove(list.size() - 1);
            list.remove(list.size() - 1);
            return true;
        }

        public int getRandom() {
            return list.get(r.nextInt(list.size()));
        }
    }

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
