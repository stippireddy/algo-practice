package leetcode;

public class Leetcode746 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int col = 0; col < n; col++) {
            int i = 0, j = col;
            int num = matrix[i][col];
            while (i < m && j < n) {
                if (matrix[i][j] != num) {
                    return false;
                }
                i++;
                j++;
            }
        }
        for (int row = 1; row < m; row++) {
            int i = row, j = 0;
            int num = matrix[row][j];
            while (i < m && j < n) {
                if (matrix[i][j] != num) {
                    return false;
                }
                i++;
                j++;
            }
        }
        return true;
    }
}
