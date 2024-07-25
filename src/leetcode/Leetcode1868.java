package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// encoded1[i] = [vali, freqi]
public class Leetcode1868 {
    public List<List<Integer>> findRLEArray(int[][] encoded1, int[][] encoded2) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < encoded1.length && j < encoded2.length) {
            int minFrequency = Integer.min(encoded1[i][1], encoded2[j][1]);
            int product = encoded1[i][0] * encoded2[j][0];
            encoded1[i][1] -= minFrequency;
            encoded2[j][1] -= minFrequency;
            if (encoded1[i][1] == 0 && encoded2[j][1] == 0) {
                i++;
                j++;
            } else if (encoded1[i][1] == 0) {
                i++;
            } else {
                j++;
            }
            if (result.isEmpty() || result.get(result.size() - 1).get(0) != product) {
                result.add(Arrays.asList(product, minFrequency));
            } else {
                int currentFrequency = result.get(result.size() - 1).get(1);
                result.get(result.size() - 1).set(1, currentFrequency + minFrequency);
            }
        }
        return result;
    }
}
