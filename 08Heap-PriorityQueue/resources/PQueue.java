import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQueue {
  public static void main(String[] args) {
    // Queue<Double> q = new LinkedList<>();
    Queue<Double> q = new PriorityQueue<>(Collections.reverseOrder());
    q.offer(4.2);
    q.offer(2.2);
    q.offer(1.25);
    q.offer(5.2);

    while (!q.isEmpty()) {
      System.out.println(q.poll());
    }
  }
}
