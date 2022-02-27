package xis;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode036 {

  public boolean isValidSudoku(char[][] board) {
    HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
    HashMap<Integer, HashSet<Character>> columns = new HashMap<>();
    HashMap<Integer, HashSet<Character>> grids = new HashMap<>();
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.') {
          rows.putIfAbsent(i, new HashSet<>());
          columns.putIfAbsent(j, new HashSet<>());
          grids.putIfAbsent(3 * (i / 3) + j / 3, new HashSet<>());
          if (!rows.get(i).add(board[i][j]) || !columns.get(j).add(board[i][j]) || !grids.get(
                  3 * (i / 3) + j / 3)
              .add(board[i][j])) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
