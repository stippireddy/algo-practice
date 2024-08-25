package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Leetcode1343 {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        for (int i = 0; i < k - 1; i++) {
            sum += arr[i];
        }
        int count = 0;
        for (int i = k - 1; i < arr.length; i++) {
            sum += arr[i];
            if (sum >= k * threshold) {
                count++;
            }
            sum -= arr[i - k + 1];
        }
        return count;
    }
}