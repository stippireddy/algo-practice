package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Leetcode380 {
    class RandomizedSet {

        private ArrayList<Integer> list;

        private Map<Integer, Integer> map;

        private Random random;

        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            map.put(val, list.size());
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            int index = map.get(val);
            map.put(list.get(list.size() - 1), index);
            list.set(index, list.get(list.size() - 1));
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }


}
