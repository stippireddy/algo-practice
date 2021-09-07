package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode1041 {
    public boolean isRobotBounded(String instructions) {
        HashMap<Character, int[]> map = new HashMap<>();
        map.put('N', new int[]{0, 1});
        map.put('S', new int[]{0, -1});
        map.put('E', new int[]{1, 0});
        map.put('W', new int[]{-1, 0});
        char direction = 'N';
        int[] current = {0, 0};
        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                int[] increment = map.get(direction);
                current[0] += increment[0];
                current[1] += increment[1];
            } else {
                direction = changeDirection(direction, c);
            }
        }
        return Arrays.equals(current, new int[]{0, 0}) || direction != 'N';
    }

    private char changeDirection(char direction, char c) {
        switch (direction) {
            case 'N':
                return c == 'L' ? 'W' : 'E';
            case 'S':
                return c == 'L' ? 'E' : 'W';
            case 'E':
                return c == 'L' ? 'N' : 'S';
            default:
                return c == 'L' ? 'S' : 'N';
        }
    }
}
