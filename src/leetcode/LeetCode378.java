/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
 */
package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode378 {

    public int kthSmallestUsingPriorityQueue(int[][] matrix, int k) {
        PriorityQueue<HeapNode> pq = new PriorityQueue<>(Comparator.comparingInt(x -> matrix[x.row][x.col]));
        for (int i = 0; i < matrix.length; i++) {
            pq.add(new HeapNode(i, 0));
        }
        while (k-- > 1) {
            HeapNode popped = pq.poll();
            if (popped.col + 1 < matrix.length) {
                pq.add(new HeapNode(popped.row, popped.col + 1));
            }
        }
        HeapNode result = pq.poll();
        return matrix[result.row][result.col];
    }

    // BinarySearch
    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0];
        int high = matrix[matrix.length - 1][matrix[0].length - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countSmallerElements(matrix, mid);
            if (count <= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int countSmallerElements(int[][] matrix, int mid) {
        int i = 0, j = matrix[0].length - 1;
        int count = 0;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] < mid) {
                count += j + 1;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}


class HeapNode {
    int row;
    int col;

    public HeapNode(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
