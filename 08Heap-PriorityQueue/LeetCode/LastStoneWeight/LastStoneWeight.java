package LastStoneWeight;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
  class Solution {
    public int lastStoneWeight(int[] stones) {
      Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for (int s : stones) {
        pq.offer(s);
      }
      while (pq.size() > 1) {
        int x = pq.poll();
        int y = pq.poll();

        if (x != y) {
          pq.offer(Math.abs(x - y));
        }
      }
      pq.offer(0);

      return pq.peek();
    }
  }
}
