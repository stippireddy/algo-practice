package hackerrank.sorting;

import java.util.Scanner;

public class InsertionSortShiftCounter {

	public static void main(String[] args) {
		InsertionSortShiftCounter q = new InsertionSortShiftCounter();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			int s = in.nextInt();
			int[] input = new int[s];
			for (int i = 0; i < s; i++) {
				input[i] = in.nextInt();
			}
			System.out.println(q.count(input));
		}
		in.close();
	}

	public long count(int[] input) {
		long count = 0;
		for (int i = 1; i < input.length; i++) {
			int key = input[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (key < input[j]) {
					input[j + 1] = input[j];
					count++;
				} else {
					break;
				}
			}
			input[j + 1] = key;
		}
		return count;
	}
}
