package leetcode;

public class Leetcode498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int i = 0, j = 0, count = 0, n = mat.length * mat[0].length;
        int[] result = new int[n];
        while (count < n) {
            while (i >= 0 && j < mat[0].length) {
                result[count++] = mat[i][j];
                i--;
                j++;
            }
            if(i < 0 && j < mat[0].length) {
                i = 0;
            }
            if(i >= 0 && j == mat[0].length) {
                j--;
            }
        }
        return result;
    }
}
