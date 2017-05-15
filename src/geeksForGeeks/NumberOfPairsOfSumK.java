package geeksForGeeks;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/*
 * This GeeksForGeeks problem can be found @ http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 */

public class NumberOfPairsOfSumK {

	public static int findNumberOfPairs(int[] input, int k) {
		if (input.length < 2) {
			return 0;
		}
		Arrays.sort(input);
		int i = 0;
		int j = input.length - 1;
		int count = 0;
		while (i < j) {
			if (input[i] + input[j] < k) {
				i++;
			} else if (input[i] + input[j] > k) {
				j--;
			} else {
				count++;
				i++;
				j--;
			}
		}
		return count;
	}

	public static int findNumberOfPairsUsingHashMap(int[] input, int k) {
		if (input.length < 2) {
			return 0;
		}
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>(input.length);
		for (int i : input) {
			map.put(i, i);
		}
		for (int i : input) {
			if (map.containsKey(k - i)) {
				count++;
			}
		}
		return count / 2;
	}

	public static void main(String[] args) throws IOException {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(findNumberOfPairs(input, 19));
		System.out.println(findNumberOfPairsUsingHashMap(input, 19));
	}

}
