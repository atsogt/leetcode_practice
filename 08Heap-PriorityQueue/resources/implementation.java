import java.util.ArrayList;
import java.util.List;

public class implementation {

  public class Heap {

    List<Integer> heap;

    // implementation
    public Heap() {
      heap = new ArrayList<Integer>();
      heap.add(0);
    }

    // Percolate up
    public void push(int val) {
      heap.add(val);
      int i = heap.size() - 1;
      // i is less greater one since heap is one indexed
      // current val is less than parent node in min heap
      while (i > 1 && heap.get(i) < heap.get(i / 2)) {
        int temp = heap.get(i);
        heap.set(i, heap.get(i / 2));
        heap.set(i / 2, temp);
        // update index to parent index
        i = i / 2;
      }
    }
  }

}
