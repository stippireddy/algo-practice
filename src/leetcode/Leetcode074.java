package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode074 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int first = 0, last = m - 1;
        while(first< last) {
            int mid = first + (last - first) / 2;
            if(matrix[mid][n -1] < target) {
                first = mid + 1;
            } else {
                last = mid;
            }
        }
        if(first == m) {
            return false;
        }
        return Arrays.binarySearch(matrix[first], target) >= 0;
    }
}
