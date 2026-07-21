package Heap_ScenarioBased;
import java.util.*;

public class Tok_k_Larger {
     List<Integer> topKLargest(int[] transactions, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int amount : transactions) {
            if (minHeap.size() < k) {
                minHeap.offer(amount);
            } else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }
        return new ArrayList<>(minHeap);
    }
    public static void main(String[] args) {
        Tok_k_Larger topK = new Tok_k_Larger();
        int[] transactions = {100, 200, 50, 300, 150, 400};
        int k = 3;
        List<Integer> largestTransactions = topK.topKLargest(transactions, k);
        System.out.println(largestTransactions); // Output: [200, 300, 400]
    }

}



