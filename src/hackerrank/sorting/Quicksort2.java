package hackerrank.sorting;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * This is my solution for the problem on Hackerrank @ https://www.hackerrank.com/challenges/quicksort2
 */

public class Quicksort2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int s = in.nextInt();
    int[] input = new int[s];
    for (int i = 0; i < s; i++) {
      input[i] = in.nextInt();
    }
    Quicksort2 q = new Quicksort2();
    q.quickSort(input, 0, input.length - 1);
    in.close();
  }

  public void quickSort(int[] input, int i, int j) {
    if (i < j) {
      int q = partition(input, i, j);
      quickSort(input, i, q - 1);
      quickSort(input, q + 1, j);
      print(input, i, j);
      System.out.println();
    }
  }

  private void print(int[] input, int i, int j) {
    System.out.print(input[i]);
    for (int k = i + 1; k <= j; k++) {
      System.out.print(" " + input[k]);
    }
  }

  public int partition(int[] input, int low, int high) {
    int key = input[low];
    ArrayList<Integer> lesserItems = new ArrayList<Integer>();
    ArrayList<Integer> greaterItems = new ArrayList<Integer>();
    for (int j = low + 1; j <= high; j++) {
      if (input[j] < key) {
        lesserItems.add(input[j]);
      } else {
        greaterItems.add(input[j]);
      }
    }
    int count = low;
    for (int i : lesserItems) {
      input[count++] = i;
    }
    input[count] = key;
    int returnVal = count++;
    for (int i : greaterItems) {
      input[count++] = i;
    }
    return returnVal;
  }
}
