package geeksForGeeks;

import java.util.Arrays;

/*
 * Given an unsorted array of both negative and positive integer, the task is 
 * to place all the negative elements at the end of array while maintaining 
 * the input order of the elements.
 */

public class RearrangePositiveNegative {

	/*
	 * This GeeksForGeeks problem can be found @
	 * http://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/
	 */

	public void extraSpace(int[] a) {
		int[] temp = new int[a.length];
		int p = 0;
		for (int i : a) {
			if (i > 0) {
				temp[p++] = i;
			}
		}
		for (int i : a) {
			if (i < 0) {
				temp[p++] = i;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			a[i] = temp[i];
		}
	}

	public void constSpaceWithInsertionSort(int[] a) {
		int lastNeg = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < 0) {
				for (int j = i; j > lastNeg; j--) {
					swap(a, j, j - 1);
				}
				lastNeg++;
			}
		}
	}

	private void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

	public static void main(String[] args) {
		int[] input = { 1, -1, 3, 2, -7, -5, 11, 6 };
		RearrangePositiveNegative driver = new RearrangePositiveNegative();
		driver.constSpaceWithInsertionSort(input);
		System.out.println(Arrays.toString(input));
		input = new int[] { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
		driver.constSpaceWithInsertionSort(input);
		System.out.println(Arrays.toString(input));
	}
}
