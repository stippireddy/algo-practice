package leetCode;

public class LeetCode476 {

	public int findComplement(int num) {
		String input = Integer.toBinaryString(num);
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '0') {
				charArray[i] = '1';
			} else {
				charArray[i] = '0';
			}
		}
		return Integer.parseInt(new String(charArray), 2);
    }
}
