package geeksForGeeks;

/*This geeksforgeeks problem can be found @ http://www.geeksforgeeks.org/find-smallest-value-represented-sum-subset-given-array/
 * Given a sorted array (sorted in non-decreasing order) of positive numbers, find the smallest positive integer value that
 * cannot be represented as sum of elements of any subset of given set. Expected time complexity is O(n).
 * */

public class SmallestPosIntegerNotSumOfSubsetOfArray {

  public static int find(int[] array) {
    int result = 1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > result) {
        return result;
      }
      result = result + array[i];
    }
    return result;
  }
}
