package CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimal {
  public class Solution {
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
      res = new ArrayList<>();
      Arrays.sort(nums);

      dfs(0, new ArrayList<>(), 0, nums, target);
      return res;
    }

    private void dfs(int i, List<Integer> cur, int total, int[] nums, int target) {
      if (total == 0) {
        res.add(new ArrayList<>(cur));
        return;
      }
      // difference
      for (int j = i; j < nums.length; j++) {
        if (total + nums[j] > target) {
          return;
        }
        cur.add(nums[j]);
        dfs(j, cur, total - nums[j], nums, target);
        cur.remove(cur.size() - 1);
      }
    }
  }

}
