package leetCode;

import java.util.Arrays;

public class LeetCode937 {
    public String[] reorderLogFiles(String[] logs) {
        int k = logs.length - 1;
        for (int i = logs.length - 1; i >= 0; i--) {
            if (Character.isDigit(logs[i].split(" ", 2)[1].charAt(0))) {
                swap(logs, i, k);
                k--;
            }
        }
        Arrays.sort(logs, 0, k + 1, (a, b) -> {
            String[] splitA = a.split(" ", 2);
            String[] splitB = b.split(" ", 2);
            if (splitA[1].compareTo(splitB[1]) == 0) {
                return splitA[0].compareTo(splitB[0]);
            }
            return splitA[1].compareTo(splitB[1]);
        });
        return logs;
    }

    private void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
