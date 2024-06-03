package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Leetcode636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        ArrayDeque<Job> stack = new ArrayDeque<>();
        for (String log : logs) {
            String[] split = log.split(":");
            int id = Integer.parseInt(split[0]);
            boolean isStart = split[1].equals("start");
            int timestamp = Integer.parseInt(split[2]);
            if (isStart) {
                stack.push(new Job(id, isStart, timestamp));
            } else {
                Job start = stack.pop();
                result[start.id] += timestamp - start.timestamp + 1 - start.excludeTime;
                if (!stack.isEmpty()) {
                    stack.peek().excludeTime += timestamp - start.timestamp + 1;
                }
            }
        }
        return result;
    }

    private static class Job {
        int id;
        boolean isStart;
        int timestamp;
        int excludeTime;

        public Job(int id, boolean isStart, int timestamp) {
            this.id = id;
            this.isStart = isStart;
            this.timestamp = timestamp;
        }

        @Override
        public String toString() {
            return "Job{" +
                    "id=" + id +
                    ", isStart=" + isStart +
                    ", timestamp=" + timestamp +
                    ", excludeTime=" + excludeTime +
                    '}';
        }
    }

    public static void main(String[] args) {
        Leetcode636 l = new Leetcode636();
        System.out.println(Arrays.toString(l.exclusiveTime(1, Arrays.asList(
                "0:start:0", "0:start:1", "0:start:2", "0:end:3", "0:end:4", "0:end:5"))));
    }


}


