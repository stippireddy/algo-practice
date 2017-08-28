package leetCode;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode349 {
  public int[] intersectionUsingTwoHashSets(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums1.length; i++) {
      set.add(nums1[i]);
    }
    HashSet<Integer> resultSet = new HashSet<>();
    for (int j = 0; j < nums2.length; j++) {
      if (set.contains(nums2[j])) {
        resultSet.add(nums2[j]);
      }
    }
    int[] result = new int[resultSet.size()];
    int k = 0;
    for (Integer i : resultSet) {
      result[k++] = i;
    }
    return result;
  }

  public int[] intersectionSortingInputs(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i = 0;
    int j = 0;
    HashSet<Integer> set = new HashSet<>();
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] == nums2[j]) {
        set.add(nums1[i]);
        i++;
        j++;
      } else if (nums1[i] < nums2[j]) {
        i++;
      } else {
        j++;
      }
    }
    int[] result = new int[set.size()];
    int k = 0;
    for (Integer l : set) {
      result[k++] = l;
    }
    return result;
  }
}
