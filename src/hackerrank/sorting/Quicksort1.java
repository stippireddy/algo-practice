package hackerrank.sorting;

import java.util.Scanner;

/*
 * This Hackerrank problem can be found @ https://www.hackerrank.com/challenges/quicksort1
 */

public class Quicksort1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] array = new int[s];
		for (int i = 0; i < s; i++) {
			array[i] = in.nextInt();
		}
		Quicksort1 q = new Quicksort1();
		q.partition(array, 0, array.length - 1);
		System.out.print(array[0]);
		for (int i = 1; i < s; i++) {
			System.out.print(" " + array[i]);
		}
		in.close();
	}

	public int partition(int[] input, int low, int high) {
		// 4 5 3 7 2
		int key = input[low];
		int i = low;
		for (int j = low + 1; j <= high; j++) {
			if (input[j] <= key) {
				i++;
				swap(input, i, j);
			}
		}
		swap(input, i, low);
		return i;
	}

	private void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
