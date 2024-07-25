package leetcode;

public class Leetcode670 {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) < s.charAt(i + 1)) {
                break;
            }
            i++;
        }
        if (i == s.length() - 1) {
            return num;
        }
        int j = i + 1;
        int max = j;
        while (j < s.length()) {
            if (s.charAt(j) >= s.charAt(max)) {
                max = j;
            }
            j++;
        }
        int min = i;
        while (i >= 0) {
            if (s.charAt(i) <= s.charAt(max)) {
                min = i;
            }
            i--;
        }
        StringBuilder sb = new StringBuilder(s);
        char temp = sb.charAt(min);
        sb.setCharAt(min, sb.charAt(max));
        sb.setCharAt(max, temp);
        return Integer.parseInt(sb.toString());
    }
}
