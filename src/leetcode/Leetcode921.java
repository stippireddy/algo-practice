package leetcode;

public class Leetcode921 {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    count++;
                }
            }
        }
        return count + open;
    }
}
