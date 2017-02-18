package geeksForGeeks;

import java.util.Arrays;

/*
 * This problem can be found @
 * http://www.geeksforgeeks.org/sort-an-array-according-to-absolute-difference-with-given-value/
 * 
 * Given an array of n distinct elements and a number x, arrange array elements according 
 * to the absolute difference with x, i. e., element having minimum difference comes 
 * first and so on. If two or more elements are at equal distance arrange them in same 
 * sequence as in the given array.
 * 
 * Input : x = 7, a[] = {10, 5, 3, 9, 2}
 * Output : a[] = {5, 9, 10, 3, 2}
 * Explanation:
 * 7 - 10 = 3(abs)
 * 7 - 5 = 2
 * 7 - 3 = 4 
 * 7 - 9 = 2(abs)
 * 7 - 2 = 5
 * So according to the difference with X, elements are arranged as 5, 9, 10, 3, 2.
 * 
 * Input : x = 6, a[] = {1, 2, 3, 4, 5}   
 * Output :  a[] = {5, 4, 3, 2, 1}
 * 
 * Input : x = 5, a[] = {2, 6, 8, 3}
 * Output :  a[] = {6, 3, 2, 8}
 * 
 */

public class SortByAbsoluteDifference {

	/*
	 * This method attempts to sort the array in a similar manner as a merge sort.
	 * Do examine the modifiedMerge for finer implementation details.
	 */
	public void sort(int[] a, int m, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			sort(a, m, low, mid);
			sort(a, m, mid + 1, high);
			modifiedMerge(a, m, low, mid, high);
		}
	}

	private void modifiedMerge(int[] a, int m, int low, int mid, int high) {
		int[] left = new int[mid - low + 1];
		int[] right = new int[high - mid];
		System.arraycopy(a, low, left, 0, left.length);
		System.arraycopy(a, mid + 1, right, 0, right.length);
		int i = 0, j = 0, k = low;
		while (i < left.length && j < right.length) {
			if (Math.abs(left[i] - m) <= Math.abs(right[j] - m)) {
				a[k++] = left[i++];
			} else {
				a[k++] = right[j++];
			}
		}
		while (i < left.length) {
			a[k++] = left[i++];
		}
		while (j < right.length) {
			a[k++] = right[j++];
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 5, 3, 9, 2 };
		SortByAbsoluteDifference s = new SortByAbsoluteDifference();
		s.sort(a, 7, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
		a = new int[] { 1, 2, 3, 4, 5 };
		s.sort(a, 6, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
		a = new int[] { 2, 6, 8, 3 };
		s.sort(a, 5, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

}
