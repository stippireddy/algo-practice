package geeksForGeeks;

import java.util.Arrays;

/*
 * This problem can be found @
 * http://www.geeksforgeeks.org/minimize-sum-product-two-arrays-permutations-allowed/

 * Given two arrays, A and B, of equal size n, the task is to find the minimum value 
 * of A[0] * B[0] + A[1] * B[1] +…+ A[n-1] * B[n-1]. Shuffling of elements of arrays
 * A and B is allowed.
 * 
 * Input : A[] = {3, 1, 1} and B[] = {6, 5, 4}. 
 * Output : 23 
 * Minimum value of S = 1*6 + 1*5 + 3*4 = 23.
 * 
 * Input : A[] = { 6, 1, 9, 5, 4 } and B[] = { 3, 4, 8, 2, 4 } 
 * Output : 80. 
 * Minimum value of S = 1*8 + 4*4 + 5*4 + 6*3 + 9*2 = 80.
 * 
 */

public class MinimizeSumOfArraysProduct {
	/*
	 * To solve this problem, we can observe that the product will be minimized
	 * if the elements at the higher end of each array are multiplied by their
	 * symmetric lower elements of the other array.
	 */

	public static int getMinProduct(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i] * b[b.length - 1 - i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(getMinProduct(new int[] { 3, 1, 1 }, new int[] { 6, 5, 4 }));
		System.out.println(getMinProduct(new int[] { 6, 1, 9, 5, 4 }, new int[] { 3, 4, 8, 2, 4 }));
	}
}
