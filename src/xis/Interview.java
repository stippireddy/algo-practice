package xis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Interview {

  public List<Integer> inverse(List<Integer> list) {
    if (list == null || list.size() == 0) {
      return list;
    }
    List<Integer> posList = filterNum(list, true); // is positive
    List<Integer> negList = filterNum(list, false);
    Collections.sort(posList);
    Collections.sort(negList, Collections.reverseOrder());
    List<Integer> res = new ArrayList<>();
    checkInverse(posList, res);
    checkInverse(negList, res);
    return res;
  }

  private List<Integer> filterNum(List<Integer> list, boolean b) {
    List<Integer> result = new ArrayList<>();
    for (int i : list) {
      if ((b && i >= 0) || (!b && i < 0)) {
        result.add(i);
      }
    }
    return result;
  }

  private void checkInverse(List<Integer> list, List<Integer> res) {
    boolean[] visited = new boolean[list.size()];
    for (int i = 0; i < list.size(); i++) {
      if (visited[i]) {
        continue;
      }
      visited[i] = true;
      int num = list.get(i);
      int idx = findDoubled(list, num * 2, visited);
      visited[idx] = true;
      res.add(num);
    }
  }

  private int findDoubled(List<Integer> list, int target, boolean[] visited) {
    int l = 0;
    int r = list.size() - 1;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (Math.abs(list.get(m)) < Math.abs(target)) {
        l = m + 1;
      } else {
        r = m;
      }
    }
    while (l < list.size() && visited[l] && list.get(l) == target) {
      l++;
    }
    if (l >= list.size() || list.get(l) != target) {
      throw new IllegalArgumentException("");
    }
    return l;
  }

  public static void main(String[] args) {
    Interview interview = new Interview();
    System.out.println(interview.inverse(Arrays.asList(-1, -2, 0, 0, 1, 2, 1, 4)));
  }
}
