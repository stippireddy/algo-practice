package leetcode;

import java.util.Arrays;

public class LeetCode1013 {

    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        if (sum % 3 != 0) {
            return false;
        }
        int runningSum = 0;
        int count = 0;
        for (int i : arr) {
            runningSum += i;
            if (runningSum * 3 == sum) {
                count++;
                runningSum = 0;
            }
        }
        return count >= 3;
    }
}
