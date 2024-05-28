package leetcode;

/**
 * Created by Sarveswara Tippireddy on 5/19/2017.
 */
public class LeetCode419 {

  public int countBattleshipsNaive(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == 'X') {
          board[i][j] = '.';
          while (j + 1 < board[0].length && board[i][j + 1] == 'X') {
            board[i][j + 1] = '.';
            j++;
          }
          while (i + 1 < board.length && board[i + 1][j] == 'X') {
            board[i + 1][j] = '.';
            i++;
          }
          count++;
        }
      }
    }
    return count;
  }

  public int countBattleshipsEfficient(char[][] board) {
    int count = 0;
    int neighbours = 0;
    int rows = board.length;
    for (int i = 0; i < rows; i++) {
      int columns = board[0].length;
      for (int j = 0; j < columns; j++) {
        if (board[i][j] == 'X') {
          count++;
          if (i + 1 < rows && board[i + 1][j] == 'X') {
            neighbours++;
          }
          if (j + 1 < columns && board[i][j + 1] == 'X') {
            neighbours++;
          }
        }
      }
    }
    return count - neighbours;
  }
}
