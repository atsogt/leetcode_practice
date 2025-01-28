import java.util.HashMap;

public class ContainsDuplicate {
  class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashMap<Integer, Integer> dup = new HashMap<>();
      for (int n : nums) {
        if (!dup.containsKey(n)) {
          dup.put(n, 1);
        } else {
          return true;
        }
      }
      // return true if duplicate
      // return false if not duplicate
      return false;
    }
  }
}
