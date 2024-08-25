package leetcode;

public class LeetCode036 {
    /*
        Simple problem. Only catch is to find the grid number corresponding to the (i,j) use this formula: (i / 3) * 3 + j / 3
    */
    public boolean isValidSudoku(char[][] board) {
        boolean[][] c = new boolean[9][9];
        boolean[][] r = new boolean[9][9];
        boolean[][] g = new boolean[9][9];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '1';
                int grid = i/ 3 * 3 + j /3;
                if(c[i][num] || r[j][num] || g[grid][num]) {
                    return false;
                }
                c[i][num] = true;
                r[j][num] = true;
                g[grid][num] = true;
            }
        }
        return true;
    }
}
