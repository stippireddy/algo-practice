package hackerrank;

import java.util.Arrays;

public class MinimumSwaps {
    static int minimumSwaps(int[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            while (i + 1 != input[i]) {
                swap(input, i, input[i] - 1);
                result++;
            }
        }
        return result;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
