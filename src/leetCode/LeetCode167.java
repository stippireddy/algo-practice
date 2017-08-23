package leetCode;

public class LeetCode167 {
  public int[] twoSum(int[] numbers, int target) {
    int i = 0, j = numbers.length - 1;
    while (i < j) {
      int currentSum = numbers[i] + numbers[j];
      if (currentSum < target) {
        i++;
      } else if (currentSum > target) {
        j--;
      } else {
        return new int[] {i + 1, j + 1};
      }
    }
    return new int[] {};
  }
}
