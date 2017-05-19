package leetCode;

/**
 * Created by Sarveswara Tippireddy on 5/19/2017.
 */
public class LeetCode463 {
	public int islandPerimeter(int[][] grid) {
		int[] sideCount = new int[5];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					sideCount[countNumberOfSurroundingSides(grid, i, j)]++;
				}
			}
		}
		return sideCount[0] * 4 + sideCount[1] * 3 + sideCount[2] * 2 + sideCount[3] * 1;
	}

	private int countNumberOfSurroundingSides(int[][] grid, int i, int j) {
		int count = 0;
		if (i - 1 >= 0) {
			if (grid[i - 1][j] == 1) {
				count++;
			}
		}
		if (j - 1 >= 0) {
			if (grid[i][j - 1] == 1) {
				count++;
			}
		}
		if (i + 1 < grid.length) {
			if (grid[i + 1][j] == 1) {
				count++;
			}
		}
		if (j + 1 < grid[0].length) {
			if (grid[i][j + 1] == 1) {
				count++;
			}
		}
		return count;
	}
}
