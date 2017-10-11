/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
 * 
 */
package leetCode;

import java.util.PriorityQueue;

public class LeetCode378 {
  public int kthSmallestUsingPriorityQueue(int[][] matrix, int k) {
    PriorityQueue<HeapNode> pq = new PriorityQueue<>((x, y) -> x.val - y.val);
    for (int i = 0; i < matrix.length; i++) {
      pq.add(new HeapNode(matrix[i][0], i, 0));
    }
    while (k-- > 1) {
      HeapNode popped = pq.poll();
      if (popped.col + 1 < matrix.length) {
        pq.add(new HeapNode(matrix[popped.row][popped.col + 1], popped.row, popped.col + 1));
      }
    }
    return pq.poll().val;
  }

  // BinarySearch
  public int kthSmallest(int[][] matrix, int k) {
    // TODO
  }
}


class HeapNode {
  int val;
  int row;
  int col;

  public HeapNode(int val, int row, int col) {
    this.val = val;
    this.row = row;
    this.col = col;
  }
}
