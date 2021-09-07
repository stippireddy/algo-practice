package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] numberOfBoxes = new int[1001];
        for (int[] arr : boxTypes) {
            numberOfBoxes[arr[1]] += arr[0];
        }
        int result = 0;
        for (int i = 1000; i >= 0 && truckSize > 0; i--) {
            result += (Integer.min(numberOfBoxes[i], truckSize) * i);
            truckSize -= numberOfBoxes[i];
        }
        return result;
    }
}
