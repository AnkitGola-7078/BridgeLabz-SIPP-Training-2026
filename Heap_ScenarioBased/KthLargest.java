package Heap_ScenarioBased;

import java.util.*;

class KthLargest {
    int findKthLargest(int[] scores, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int score : scores) {
            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest();
        int[] scores = {85, 92, 78, 90, 88, 95};
        int k = 3;
        int result = kthLargest.findKthLargest(scores, k);
        System.out.println(result); // Output: 90
    }
}
