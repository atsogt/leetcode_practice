import java.util.ArrayList;
import java.util.List;

public class Heapify {
  List<Integer> heap;

  public void heapify(ArrayList<Integer> arr) {
    // 0-th position is moved to the end
    arr.add(arr.get(0));

    heap = arr;
    int cur = (heap.size() - 1) / 2;
    while (cur > 0) {
      // Percolate Down
      int i = cur;
      while (2 * i < heap.size()) {
        if (2 * i + 1 < heap.size() &&
            heap.get(2 * i + 1) < heap.get(2 * i) &&
            heap.get(i) > heap.get(2 * i + 1)) {
          // Swap right child
          int tmp = heap.get(i);
          heap.set(i, heap.get(2 * i + 1));
          heap.set(2 * i + 1, tmp);
          i = 2 * i + 1;
        } else if (heap.get(i) > heap.get(2 * i)) {
          // Swap left child
          int tmp = heap.get(i);
          heap.set(i, heap.get(2 * i));
          heap.set(2 * i, tmp);
          i = 2 * i;
        } else {
          break;
        }
      }
      cur--;
    }
    return;
  }
}
