package KClosestPoint;

import java.util.PriorityQueue;

public class maxHeap {
  public class Solution {
    public int[][] kClosest(int[][] points, int k) {
      // Priority queue constructor tailor compare function to have specific
      // comparison between distance from the closes point
      PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
          (a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1],
              a[0] * a[0] + a[1] * a[1]));

      for (int[] point : points) {
        maxHeap.offer(point);
        if (maxHeap.size() > k) {
          maxHeap.poll();
        }
      }

      int[][] res = new int[k][2];
      int i = 0;
      while (!maxHeap.isEmpty()) {
        res[i++] = maxHeap.poll();
      }
      return res;
    }
  }
}
