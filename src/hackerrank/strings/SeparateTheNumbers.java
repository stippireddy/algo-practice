package hackerrank.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeparateTheNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String input = br.readLine();
			solution1(input);
		}
	}

	public static void solution2(String input) {
		if (input.length() < 2) {
			System.out.println("NO");
		} else {
			int dLength = 1;
			int length = input.length();
			StringBuffer sb = new StringBuffer();
			while (dLength <= length / 2) {
				long index = 0;
				long currentInteger = Long.parseLong(input.substring((int) index, (int) (index + dLength)));
				long firstInteger = currentInteger;
				do{
					sb.append(currentInteger);
					currentInteger++;
				} while ((sb.toString() + currentInteger).length() <= length);
				if (sb.toString().equals(input)) {
					System.out.println("YES " + firstInteger);
					return;
				} else {
					dLength++;
					sb.delete(0, sb.length());
				}
			}
			System.out.println("NO");
		}
	}

	public static void solution1(String input) {
		if (input.length() < 2) {
			System.out.println("NO");
		} else {
			int dLength = 1;
			int length = input.length();
			while (dLength <= length / 2) {
				boolean sequenceExistsForDigitSize = true;
				long index = 0;
				long currentInteger = Long.parseLong(input.substring((int) index, (int) (index + dLength)));
				long firstInteger = currentInteger;
				index = index + dLength;
				while (index < length) {
					currentInteger++;
					long lengthOfNextNumber = ("" + currentInteger).length();
					if (index + lengthOfNextNumber <= length && ("" + currentInteger)
							.equals(input.substring((int) index, (int) (index + lengthOfNextNumber)))) {
						index = index + lengthOfNextNumber;
					} else {
						sequenceExistsForDigitSize = false;
						index = 0;
						dLength++;
						break;
					}
				}
				if (sequenceExistsForDigitSize) {
					System.out.println("YES " + firstInteger);
					return;
				}
			}
			System.out.println("NO");
		}

	}
}
