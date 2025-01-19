import java.util.PriorityQueue;

class HeapKth {

  private PriorityQueue<Integer> minHeap;
  private int k;

  public HeapKth(int k, int[] nums) {
    this.k = k;
    this.minHeap = new PriorityQueue<>();
    for (int num : nums) {
      minHeap.offer(num);
      // if size is within 3, we don't do anything
      // if size goes OVER 3, we pop the smallest root val
      if (minHeap.size() > k) {
        minHeap.poll();
      }
    }
  }

  public int add(int val) {
    minHeap.offer(val);
    if (minHeap.size() > k) {
      minHeap.poll();
    }
    return minHeap.peek();
  }
}