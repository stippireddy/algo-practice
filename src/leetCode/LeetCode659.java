package leetCode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LeetCode659 {
    public static boolean isPossible(int[] nums) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int i : nums) {
            int currentLength = 1;
            map.putIfAbsent(i, new PriorityQueue<>());
            if (map.containsKey(i - 1)) {
                currentLength = map.get(i - 1).poll() + 1;
                if (map.get(i - 1).isEmpty()) {
                    map.remove(i - 1);
                }
            }
            map.get(i).offer(currentLength);
        }
        for (PriorityQueue<Integer> pq : map.values()) {
            while (!pq.isEmpty()) {
                if (pq.poll() < 3) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPossible(new int[]{1, 2, 3, 3, 4, 5}));
        //[1,2,3,3,4,5]
        //[1,2,3,3,4,4,5,5]
        //[1,2,3,4,4,5]
    }
}
