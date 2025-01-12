import java.util.ArrayList;
import java.util.List;

public class implementation {

  public class Heap {

    List<Integer> heap;

    public Heap() {
      heap = new ArrayList<Integer>();
      heap.add(0);
    }

    public void push(int val) {
      heap.add(val);
      int i = heap.size() - 1;

      // Percolate up
      while (i > 1 && heap.get(i) < heap.get(i / 2)) {
        int tmp = heap.get(i);
        heap.set(i, heap.get(i / 2));
        heap.set(i / 2, tmp);
        i = i / 2;
      }
    }
  }

}
