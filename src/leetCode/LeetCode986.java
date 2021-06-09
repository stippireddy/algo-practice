package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode986 {

  public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
    if (firstList.length == 0 || secondList.length == 0) {
      return new int[0][];
    }
    int i = 0, j = 0;
    List<int[]> resultList = new ArrayList<>();
    while (i < firstList.length && j < secondList.length) {
      if ((firstList[i][0] <= secondList[j][1] && firstList[i][1] >= secondList[j][0])) {
        int[] intersection = new int[2];
        intersection[0] = Integer.max(firstList[i][0], secondList[j][0]);
        intersection[1] = Integer.min(firstList[i][1], secondList[j][1]);
        resultList.add(intersection);
      }
      if (firstList[i][1] < secondList[j][1]) {
        i++;
      } else {
        j++;
      }
    }
    int[][] result = new int[resultList.size()][2];
    for (int k = 0; k < result.length; k++) {
      result[k][0] = resultList.get(k)[0];
      result[k][1] = resultList.get(k)[1];
    }
    return result;
  }
}
