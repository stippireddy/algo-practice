/**
 * Created by Sarveswara Tippireddy on Jul 3, 2017
 *
 * <p>This GeeksForGeeks problem can be found @ link
 */
package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonals {
  public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
    int length = a.size();
    int i = 0;
    int j = 0;
    int count = 0;
    int maxCount = length * length;
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    int resultIndex = -1;
    while (count < maxCount) {
      while (j < length) {
        result.add(new ArrayList<Integer>());
        resultIndex += 1;
        int row = i;
        int col = j;
        while (col >= 0 && row < length) {
          result.get(resultIndex).add(a.get(row).get(col));
          col--;
          row++;
          count++;
        }
        j++;
      }
      j--;
      i++;
    }
    return result;
  }

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    a.add(new ArrayList<Integer>(Arrays.asList(1)));
    diagonal(a);
  }
}
