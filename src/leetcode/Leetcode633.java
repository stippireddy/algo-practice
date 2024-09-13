package leetcode;

public class Leetcode633 {
    public boolean judgeSquareSum(int c) {
        // Note the usage of long here
        long left = 0, right = (long) Math.sqrt(c);
        while (left <= right) {
            long sumOfSquares = left * left + right * right;
            if (sumOfSquares == c) {
                return true;
            }
            if (sumOfSquares > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
