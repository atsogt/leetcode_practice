import java.util.HashMap;

public class LRUcache {
  class LRUCache {

    HashMap<Integer, Integer> hm;
    int size;

    public LRUCache(int capacity) {
      hm = new HashMap<>();
      size = capacity;
    }

    public int get(int key) {
      return hm.containsKey(key) ? hm.get(key) : -1;
    }

    public void put(int key, int value) {
      hm.put(key, value);

      if (hm.size() > size) {

      }
    }
  }

}
