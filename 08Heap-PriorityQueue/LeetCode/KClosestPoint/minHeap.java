package KClosestPoint;

import java.util.Comparator;
import java.util.PriorityQueue;

public class minHeap {
  public int[][] kClosest(int[][] points, int K) {
    // Create a min-heap (PriorityQueue) that orders elements based on their first
    // element (which will store the distance).
    PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

    // Iterate through all the points.
    for (int[] point : points) {
      // Calculate the squared Euclidean distance of the current point from the origin
      // (0, 0).
      int dist = point[0] * point[0] + point[1] * point[1];

      // Offer a new int[] to the min-heap. This array stores:
      // - dist: The calculated squared distance (used for comparison in the heap).
      // - point[0]: The x-coordinate of the original point.
      // - point[1]: The y-coordinate of the original point.
      minHeap.offer(new int[] { dist, point[0], point[1] });
    }

    // Create a result array to store the K closest points.
    int[][] result = new int[K][2];

    // Extract the K closest points from the min-heap.
    for (int i = 0; i < K; ++i) {
      // Poll (remove and return) the element with the smallest distance (top of the
      // min-heap).
      int[] point = minHeap.poll();

      // Store the original x and y coordinates (point[1] and point[2]) in the result
      // array.
      // We only need the coordinates, not the distance itself in the final result.
      result[i] = new int[] { point[1], point[2] };
    }

    // Return the array of K closest points.
    return result;
  }
}
