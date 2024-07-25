package leetcode;

public class LeetCode1011 {

    /*
        Binary search problem.
        Search space is going to be the max Weight as low and the sum of weights as high.
        canShipWithinDays will run in o(n)
     */
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int weight : weights) {
            low = Integer.max(weight, low);
            high += weight;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canShipWithinDays(weights, mid, days)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canShipWithinDays(int[] weights, int capacity, int days) {
        int daysNeeded = 1;
        int currentLoad = 0;
        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                daysNeeded++;
                currentLoad = weight;
            } else {
                currentLoad += weight;
            }
        }
        return daysNeeded <= days;
    }
}
