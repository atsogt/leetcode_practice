import java.util.ArrayList;
import java.util.List;

public class Heap {
  // basic implementation of heap

  List<Integer> heap;

  public Heap() {
    heap = new ArrayList<Integer>();
    // to mimic the 1-based index
    heap.add(0);
  }

  // percolate up
  public void add(int val) {
    heap.add(val);
    int i = heap.size() - 1;
    while (i > 1 && heap.get(i) < heap.get(i / 2)) // i is not out of bounds && parent is greater than current value
    {
      // swapping current node with parent if it is less than parent
      int temp = heap.get(i);
      heap.set(i, heap.get(i / 2));
      heap.set(i / 2, temp);
      // change the index
      i = i / 2;
    }
  }

  public void pop() {
    // base case of heap empty
    if (heap.size() == 1) {
      return;
    }

    if (heap.size() == 2) {
      // removing las element
      heap.remove(heap.size() - 1);
    }

    heap.set(1, heap.remove(heap.size() - 1)); // before getting index
    // int i = heap.size() - 1; // this needs be 1
    int i = 1;

    // percolate down
    while (2 * i < heap.size()) {
      // right child
      // 1.right child exists
      if (2 * i + 1 < heap.size() &&
          heap.get(i * 2 + 1) < heap.get(i * 2) &&
          heap.get(i) > heap.get(i * 2 + 1)) {

        int temp = heap.get(i);
        heap.set(i, heap.get(i * 2 + 1));
        heap.set(i * 2 + 1, temp);

        i = 2 * i / 2;
        // left child is less than right child
      } else if (heap.get(i) > heap.get(i * 2)) {
        int temp = heap.get(i);
        heap.set(i, heap.get(i * 2));
        heap.set(i * 2, temp);

        i = 2 * 1;
      } else {
        break;
      }

    }
  }

}
