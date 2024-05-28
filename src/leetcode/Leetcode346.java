package leetcode;

import java.util.ArrayDeque;

class MovingAverage {
    int currentSize;
    int maxSize;

    int sum;

    ArrayDeque<Integer> queue;

    public MovingAverage(int size) {
        this.maxSize = size;
        this.currentSize = 0;
        this.sum = 0;
        this.queue = new ArrayDeque<>();
    }

    public double next(int val) {
        queue.add(val);
        sum += val;
        if (currentSize < maxSize) {
            currentSize++;
        } else {
            sum -= queue.poll();
        }
        return (double) sum / currentSize;
    }
}