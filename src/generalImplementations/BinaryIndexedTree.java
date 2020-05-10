package generalImplementations;

import java.util.Arrays;

/*
 * This is my implementation of Binary Indexed Tree or Fenwick Tree. For conceptual understanding refer to the following links.
 *
 * http://www.geeksforgeeks.org/binary-indexed-tree-or-fenwick-tree-2/
 * https://www.youtube.com/watch?v=v_wj_mOAlig
 * https://www.youtube.com/watch?v=CWDQJGaN1gY
 *
 */
public class BinaryIndexedTree {

  int[] bit;
  int[] input;

  public BinaryIndexedTree(int[] input) {
    this.input = input;
    bit = new int[input.length + 1];
  }

  public static void main(String[] args) {
    BinaryIndexedTree b = new BinaryIndexedTree(new int[]{3, 2, -1, 6, 5, 4, -3, 3, 7, 2, 3});
    System.out.println(Arrays.toString(b.create()));
    // [0, 3, 5, -1, 10, 5, 9, -3, 19, 7, 9, 3]
    System.out.println(Arrays.toString(b.update(3, 9)));
    // [0, 3, 5, -1, 13, 5, 9, -3, 22, 7, 9, 3]
    System.out.println(Arrays.toString(b.update(4, 6)));
    // [0, 3, 5, -1, 13, 6, 10, -3, 23, 7, 9, 3]

    b = new BinaryIndexedTree(new int[]{1, 7, 3, 0, 5, 8, 3, 2, 6, 2, 1, 1, 4, 5});
    System.out.println(Arrays.toString(b.create()));
    System.out.println(b.getSum(5));
  }

  /*
   * This method creates an array representation of the Binary Indexed Tree
   * for the given input array. It is to be carefully noted that the size of
   * the BIT is one more than the size of the input.
   */
  public int[] create() {
    for (int i = 0; i < input.length; i++) {
      int bitIndex = i + 1;
      while (bitIndex < bit.length) {
        bit[bitIndex] += input[i];
        bitIndex = getChild(bitIndex);
      }
    }
    return bit;
  }

  /*
   * If the value of the input array is updated at an index i with a value x,
   * this method should be called to update the corresponding BIT.
   *
   * i is to be mentioned in zero-based index notation.
   */
  public int[] update(int i, int x) {
    int bitIndex = i + 1;
    int updateVal = x - input[i];
    while (bitIndex < bit.length) {
      bit[bitIndex] += updateVal;
      bitIndex = getChild(bitIndex);
    }
    return bit;
  }

  /*
   * This method provides the sum of the first n numbers in the input array.
   */
  public int getSum(int n) {
    int sum = 0;
    while (n > 0) {
      sum += bit[n];
      n = getParent(n);
    }
    return sum;
  }

  /*
   * getChild is a helper method to give the index of the next child of a node
   * i of the BIT.
   *
   * i + (i & -i) adds the last set bit of i to itself.
   */
  private int getChild(int i) {
    return i + (i & -i);
  }

  private int getParent(int i) {
    return i - (i & -i);
  }
}
