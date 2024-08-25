package leetcode;

public class Leetcode1209 {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < k - 1) {
            sb.append(s.charAt(i));
            i++;
        }
        while (i < s.length()) {
            sb.append(s.charAt(i));
            i++;
            int index = sb.length() - 1;
            char c = sb.charAt(index);
            int count = 0;
            while (index >= 0 && c == sb.charAt(index)) {
                index--;
                count++;
            }
            if (count >= k) {
                sb.setLength(sb.length() - k);
            }
        }
        return sb.toString();
    }
}
