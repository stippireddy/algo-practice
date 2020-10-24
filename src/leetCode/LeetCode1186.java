package leetCode;

public class LeetCode1186 {

  public static void main(String[] args) {
    LeetCode1186 leetCode1186 = new LeetCode1186();
    System.out.println(leetCode1186.maximumSum(new int[]{1, -2, -2, 3}));
  }

  public int maximumSum(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int maxLeftSum = 0;
      int runningSum = 0;
      int movingPointer = i - 1;
      while (movingPointer > -1) {
        runningSum = runningSum + arr[movingPointer];
        maxLeftSum = Integer.max(maxLeftSum, runningSum);
        movingPointer--;
      }
      int maxRightSum = 0;
      runningSum = 0;
      movingPointer = i + 1;
      while (movingPointer < arr.length) {
        runningSum = runningSum + arr[movingPointer];
        maxRightSum = Integer.max(maxRightSum, runningSum);
        movingPointer++;
      }
      maxSum = Integer.max(maxSum, maxLeftSum + maxRightSum);
    }
    return maxSum;
  }
}
