package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {

    private PriorityQueue<Integer> minHeap;

    private PriorityQueue<Integer> maxHeap;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty() || num < maxHeap.peek()) {
            maxHeap.offer(num);
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.remove());
            }
        } else {
            minHeap.offer(num);
            if (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.offer(minHeap.remove());
            }
        }
    }

    public double findMedian() {
        if (maxHeap.size() < minHeap.size()) {
            return minHeap.peek();
        } else if (minHeap.size() < maxHeap.size()) {
            return maxHeap.peek();
        } else {
            return ((double) (maxHeap.peek() + minHeap.peek())) / 2.0;
        }
    }
}
