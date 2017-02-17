package hackerrank.sorting;

import java.util.Scanner;

/*
 * This Hackerrank problem can be found @ https://www.hackerrank.com/challenges/quicksort1
 */

public class Quicksort3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] input = new int[s];
		for (int i = 0; i < s; i++) {
			input[i] = in.nextInt();
		}
		Quicksort3 q = new Quicksort3();
		q.quickSort(input, 0, input.length - 1);
		in.close();
	}

	public void quickSort(int[] input, int i, int j) {
		if (i < j) {
			int q = partition(input, i, j);
			quickSort(input, i, q - 1);
			quickSort(input, q + 1, j);
		}
	}

	private void print(int[] input) {
		System.out.print(input[0]);
		for (int k = 1; k < input.length; k++) {
			System.out.print(" " + input[k]);
		}
		System.out.println();
	}

	public int partition(int[] input, int low, int high) {
		int key = input[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (input[j] <= key) {
				i++;
				swap(input, i, j);
			}
		}
		i++;
		swap(input, i, high);
		print(input);
		return i;
	}

	private void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

}
