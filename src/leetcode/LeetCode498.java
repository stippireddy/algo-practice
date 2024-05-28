package leetcode;

public class LeetCode498 {

    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length, columns = mat[0].length;
        int count = rows * columns;
        int[] result = new int[count];
        int i = 0, j = 0, k = 0;
        while (count > 0) {
            while (i >= 0 && j < columns) {
                result[k] = mat[i][j];
                k++;
                i--;
                j++;
                count--;
            }
            i++;
            if (j == columns) {
                i++;
                j--;
            }
            while (i < rows && j >= 0) {
                result[k] = mat[i][j];
                k++;
                i++;
                j--;
                count--;
            }
            j++;
            if (i == rows) {
                i--;
                j++;
            }
        }
        return result;
    }
}
