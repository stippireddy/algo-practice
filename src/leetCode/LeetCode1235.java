package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode1235 {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Job[] jobs = new Job[startTime.length];
        for (int i = 0; i < startTime.length; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(jobs, Comparator.comparingInt(j -> j.endTime));
        int[] dp = new int[jobs.length];
        dp[0] = jobs[0].profit;
        int max = dp[0];
        for (int i = 1; i < jobs.length; i++) {

        }
        return max;
    }
}

class Job {
    int startTime;
    int endTime;
    int profit;

    public Job(int startTime, int endTime, int profit) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.profit = profit;
    }
}