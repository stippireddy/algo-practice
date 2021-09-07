package leetCode;

public class LeetCode036 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] frequency = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (Character.isDigit(board[i][j])) {
                    if (frequency[board[i][j] - '1']) {
                        return false;
                    }
                    frequency[board[i][j] - '1'] = true;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            boolean[] frequency = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (Character.isDigit(board[i][j])) {
                    if (frequency[board[j][i] - '1']) {
                        return false;
                    }
                    frequency[board[j][i] - '1'] = true;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            boolean[][] frequency = new boolean[9][9];
            for (int j = 0; j < 9; j++) {
                if (Character.isDigit(board[i][j])) {
                    int row = (i / 3) * 3 + j / 3;
                    if (frequency[row][board[i][j] - '1']) {
                        return false;
                    }
                    frequency[row][board[i][j] - '1'] = true;
                }
            }
        }

        return true;
    }
}
