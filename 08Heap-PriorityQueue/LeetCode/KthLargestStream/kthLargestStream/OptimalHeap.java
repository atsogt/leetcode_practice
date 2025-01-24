package KthLargestStream.kthLargestStream;

import java.util.PriorityQueue;
import java.util.Queue;

// Design a class to find the kth largest integer in a stream of values, including duplicates. E.g. the 2nd largest from [1, 2, 3, 3] is 3. The stream is not necessarily sorted.

// Implement the following methods:

// constructor(int k, int[] nums) Initializes the object given an integer k and the stream of integers nums.
// int add(int val) Adds the integer val to the stream and returns the kth largest integer in the stream.

public class OptimalHeap {
  class KthLargest {
    Queue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
      pq = new PriorityQueue<>();
      this.k = k;
      for (int num : nums) {
        pq.add(num);
      }
    }

    public int add(int val) {
      pq.offer(val);
      while (pq.size() > k) {
        pq.poll();
      }

      return pq.peek();
    }
  }

}
