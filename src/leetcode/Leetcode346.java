package leetcode;

import java.util.ArrayDeque;

class MovingAverage {
    int maxSize;

    int sum;

    ArrayDeque<Integer> queue;

    public MovingAverage(int size) {
        this.maxSize = size;
        this.sum = 0;
        this.queue = new ArrayDeque<>();
    }

    public double next(int val) {
        queue.add(val);
        sum += val;
        if (queue.size() > maxSize) {
            sum -= queue.poll();
        }
        return (double) sum / queue.size();
    }
}