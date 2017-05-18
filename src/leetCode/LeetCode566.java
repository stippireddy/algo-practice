package leetCode;

/**
 * Created by Sarveswara Tippireddy on 5/17/2017.
 */
public class LeetCode566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rLength = nums.length;
        int cLength = nums[0].length;
        if (rLength * cLength != r * c) {
            return nums;
        } else {
            int[][] newNums = new int[r][c];
            int count = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    newNums[i][j] = nums[(count) / cLength][(count) % cLength];
                    count++;
                }
            }
            return newNums;
        }
    }
}
