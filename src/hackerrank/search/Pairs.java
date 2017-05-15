package hackerrank.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * This GeeksForGeeks problem can be found @ http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 */

public class Pairs {

	public static int findNumberOfPairs(int[] input, int k) {
		if (input.length < 2) {
			return 0;
		}
		Arrays.sort(input);
		int l = 0;
		int r = 1;
		int count = 0;
		while (r < input.length) {
			if (input[r] - input[l] < k) {
				r++;
			} else if (input[r] - input[l] > k) {
				l++;
			} else {
				count++;
				l++;
				r++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(s.nextToken());
		int k = Integer.parseInt(s.nextToken());
		int[] input = new int[N];
		s = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(s.nextToken());
		}
		System.out.println(findNumberOfPairs(input, k));

	}

}
