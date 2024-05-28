package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1762 {
    public int[] findBuildings(int[] heights) {
        if (heights == null || heights.length == 0) {
            return new int[]{};
        }
        int length = heights.length;
        List<Integer> result = new ArrayList<>();
        result.add(length - 1);
        int maxHeight = heights[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            if (heights[i] > maxHeight) {
                result.add(i);
            }
            maxHeight = Integer.max(maxHeight, heights[i]);
        }
        int[] resultArray = new int[result.size()];
        for (int i = result.size() - 1; i >= 0; i--) {
            resultArray[i - result.size() + 1] = result.get(i);
        }
        return resultArray;
    }
}
