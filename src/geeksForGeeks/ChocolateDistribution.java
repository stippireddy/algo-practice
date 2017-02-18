package geeksForGeeks;

import java.util.Arrays;

/* 
 * This problem can be found @
 * http://www.geeksforgeeks.org/chocolate-distribution-problem/
 * 
 * Given an array of n integers where each value represents number of chocolates in a packet. 
 * Each packet can have variable number of chocolates. There are m students, the task is to 
 * distribute chocolate packets such that:
 * 1. Each student gets one packet.
 * 2. Among those packets that are distributed, the goal is to achieve the minimum difference
 * between the packets containing the least and highest number of chocolates.
 * 
 * Examples:
 * 
 * Input : arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 3
 * Output: Minimum Difference is 2.
 * 
 * We have seven packets of chocolates and	we need to pick three packets for 3 students.
 * If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum 
 * packet sizes.
 * 
 * Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12}, m = 5
 * Output: Minimum Difference is 6
 * The set goes like 3,4,7,9,9 and the output is 9-3 = 6
 * 
 * Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50}, m = 7
 * Output: 10
 * We need to pick 7 packets. We pick 40, 41, 42, 44, 48, 43 and 50 to minimize difference
 * between maximum and minimum.
 */

public class ChocolateDistribution {

	/*
	 * A naive solution can be formulated by forming all the possible subarrays of size m. However we need to examine
	 * exponential number of subsets. The following algorithm sorts the array in O(nlgn) and then linearly traverses to
	 * find the minimum.
	 */
	public int getMin(int[] input, int m) {
		Arrays.sort(input);
		int minDifference = Integer.MAX_VALUE;
		for (int i = 0; i + m - 1 < input.length; i++) {
			int difference = input[i + m - 1] - input[i];
			if (difference < minDifference) {
				minDifference = difference;
			}
		}
		return minDifference;
	}

	public static void main(String[] args) {
		ChocolateDistribution c = new ChocolateDistribution();
		System.out.println(c.getMin(new int[] { 7, 3, 2, 4, 9, 12, 56 }, 3));
		System.out.println(c.getMin(new int[] { 3, 4, 1, 9, 56, 7, 9, 12 }, 5));
		System.out.println(c.getMin(new int[] { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 }, 7));
	}
}
