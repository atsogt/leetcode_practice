package KthLargestInArray;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestInArray {
  class Solution {
    Queue<Integer> minHeap;
    int k;

    // [1,2,3,4,5] 2nd largest element
    // create a heap of size k and return root; Root will always be kth largest
    public int findKthLargest(int[] nums, int k) {
      minHeap = new PriorityQueue<>();
      this.k = k;
      for (int n : nums) {
        minHeap.add(n);
      }

      while (minHeap.size() > k) {
        minHeap.remove();
      }

      return minHeap.peek();
    }
  }

}
