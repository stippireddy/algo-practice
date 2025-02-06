package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Amazon1 {
    public static String findNumber(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            return "";
        }
        List<Integer> temp = new ArrayList<>();
        while (numbers.size() > 2) {
            for (int i = 1; i < numbers.size(); i++) {
                temp.add((numbers.get(i - 1) + numbers.get(i)) % 10);
            }
            numbers = temp;
            temp = new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder();
        for(int i : numbers) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(findNumber(Arrays.asList(4,5,6,7)));
    }
}
