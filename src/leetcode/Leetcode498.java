package leetcode;

public class Leetcode498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int i = 0, j = 0, count = 0, n = mat.length * mat[0].length;
        int[] result = new int[n];
        while (count < n) {
            while (i >= 0 && j < mat[0].length) {
                result[count] = mat[i][j];
                i--;
                j++;
                count++;
            }
            if (count == n) {
                break;
            }
            // Explain this in the interview before you code
            if (i < 0 && j == mat[0].length) {
                i += 2;
                j--;
            } else if (i >= 0 && j == mat[0].length) {
                i += 2;
                j--;
            } else if (i < 0 && j < mat[0].length) {
                i++;
            }
            while (i < mat.length && j >= 0) {
                result[count] = mat[i][j];
                i++;
                j--;
                count++;
            }
            // Explain this in the interview before you code
            if (j < 0 && i == mat.length) {
                j += 2;
                i--;
            } else if (i == mat.length && j >= 0) {
                i--;
                j += 2;
            } else if (j < 0 && i < mat.length) {
                j++;
            }
        }
        return result;
    }
}
