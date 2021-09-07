package leetCode;

public class LeetCode673 {
    public int maximumSwap(int num) {
        char[] input = String.valueOf(num).toCharArray();
        int i = 0;
        while (i < input.length - 1 && input[i] > input[i + 1]) {
            i++;
        }
        if (i == input.length - 1) {
            return num;
        }
        int max = i + 1;
        for (int j = max; j < input.length; j++) {
            if (input[j] >= input[max]) {
                max = j;
            }
        }
        int swapIndex = -1;
        for (int j = 0; j <= i; j++) {
            if (input[j] < input[max]) {
                swapIndex = j;
                break;
            }
        }
        char temp = input[swapIndex];
        input[swapIndex] = input[max];
        input[max] = temp;
        return Integer.parseInt(String.valueOf(input));
    }
}
