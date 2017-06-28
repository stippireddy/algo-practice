package interviewbit.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrixI {
  public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    int[][] input = new int[a.size()][a.get(0).size()];
    for (int i = 0; i < a.size(); i++) {
      ArrayList<Integer> sublist = a.get(i);
      int j = 0;
      for (int k : sublist) {
        input[i][j] = k;
        j++;
      }
    }
    int i = 0, j = 0;
    int lowestRowIndex = 0,
        lowestColumnIndex = 0,
        highestRowIndex = a.size() - 1,
        highestColumnIndex = a.get(0).size() - 1;
    while (lowestColumnIndex <= highestColumnIndex && lowestRowIndex <= highestRowIndex) {
      i = lowestRowIndex;
      j = lowestColumnIndex;
      while (j <= highestColumnIndex) {
        result.add(input[i][j]);
        j++;
      }
      lowestRowIndex++;
      j--;
      i++;
      while (i <= highestRowIndex) {
        result.add(input[i][j]);
        i++;
      }
      highestColumnIndex--;
      i--;
      j--;
      if (lowestRowIndex <= highestRowIndex) {
        while (j >= lowestColumnIndex) {
          result.add(input[i][j]);
          j--;
        }
        highestRowIndex--;
        j++;
        i--;
      }
      if (lowestColumnIndex <= highestColumnIndex) {
        while (i >= lowestRowIndex) {
          result.add(input[i][j]);
          i--;
        }
        lowestColumnIndex++;
      }
    }
    return result;
  }
}
