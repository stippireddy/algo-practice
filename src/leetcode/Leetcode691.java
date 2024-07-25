package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode691 {
    public int minStickers(String[] stickers, String target) {
        int[] targetFrequency = new int[26];
        Map<String, Integer> dp = new HashMap<>();
        dp.put(Arrays.toString(targetFrequency), 0);
        int[][] stickersFrequency = new int[stickers.length][26];
        for (char c : target.toCharArray()) {
            targetFrequency[c - 'a']++;
        }
        boolean[] allChars = new boolean[26];
        for (int i = 0; i < stickers.length; i++) {
            String sticker = stickers[i];
            for (char c : sticker.toCharArray()) {
                stickersFrequency[i][c - 'a']++;
                allChars[c - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (targetFrequency[i] > 0 && !allChars[i]) {
                return -1;
            }
        }

        return helper(targetFrequency, stickersFrequency, dp);
    }

    private int helper(int[] targetFrequency, int[][] stickersFrequency, Map<String, Integer> dp) {
        if (dp.containsKey(Arrays.toString(targetFrequency))) {
            return dp.get(Arrays.toString(targetFrequency));
        }
        int min = Integer.MAX_VALUE;
        for (int[] sticker : stickersFrequency) {
            boolean canUseSticker = false;
            for (int i = 0; i < 26; i++) {
                if (targetFrequency[i] > 0 && sticker[i] > 0) {
                    canUseSticker = true;
                    break;
                }
            }
            if (!canUseSticker) {
                continue;
            }
            int[] nextTarget = new int[26];
            for (int i = 0; i < 26; i++) {
                nextTarget[i] = targetFrequency[i] - Integer.min(sticker[i], targetFrequency[i]);
            }
            min = Integer.min(helper(nextTarget, stickersFrequency, dp), min);
        }
        dp.put(Arrays.toString(targetFrequency), min);
        return min;
    }
}
