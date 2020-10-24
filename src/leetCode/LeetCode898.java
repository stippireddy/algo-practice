package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode898 {

  public static void main(String[] args) {
    LeetCode898 leetCode898 = new LeetCode898();
    System.out.println(leetCode898.subarrayBitwiseORs(new int[]{0}));
    System.out.println(leetCode898.subarrayBitwiseORs(new int[]{1, 1, 2}));
    System.out.println(leetCode898.subarrayBitwiseORs(new int[]{1, 2, 4}));
  }

  public int subarrayBitwiseORs1(int[] arr) {
    Set<Integer> previous = new HashSet<>();
    Set<Integer> finalSet = new HashSet<>();
    for (int i : arr) {
      Set<Integer> current = new HashSet<>();
      current.add(i);
      for (int j : previous) {
        current.add(j | i);
      }
      finalSet.addAll(current);
      finalSet.addAll(previous);
      previous = current;
    }
    return finalSet.size();
  }

  public int subarrayBitwiseORs(int[] A) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      int or = A[i];
      int x = 0;
      set.add(A[i]);
      for (int j = i - 1; j >= 0 && x != or; j--) {
        or |= A[j];
        x |= A[j];
        set.add(or);

      }
    }
    return set.size();
  }
}
