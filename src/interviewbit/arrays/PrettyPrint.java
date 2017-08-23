/**
 * Created by Sarveswara Tippireddy on Jul 3, 2017
 *
 * <p>This InterviewBit problem can be found @ link
 */
package interviewbit.arrays;

import java.util.ArrayList;

public class PrettyPrint {
  public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
    int size = 2 * a - 1;
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      result.add(new ArrayList<Integer>());
    }
    int i = 0;
    for (int j = 0; j < size; j++) {
      result.get(0).add(a);
    }
    i++;
    while (i < a) {
      int max = a - i;
      int maxCount = 2 * max - 1;
      int k = a;
      while (k > max) {
        result.get(i).add(k);
        k--;
      }
      while (maxCount > 0) {
        result.get(i).add(k);
        maxCount--;
      }
      k = max + 1;
      while (k <= a) {
        result.get(i).add(k);
        k++;
      }
      i++;
    }
    int l = 0, r = size - 1;
    while (l < r) {
      result.set(r, result.get(l));
      l++;
      r--;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(prettyPrint(1));
    System.out.println(prettyPrint(2));
    System.out.println(prettyPrint(3));
    System.out.println(prettyPrint(4));
    System.out.println(prettyPrint(5));
    System.out.println(prettyPrint(6));
    System.out.println(prettyPrint(7));
  }
}
