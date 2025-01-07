import java.util.ArrayList;
import java.util.List;

public class Subset2 {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    // Start backtracking from the beginning
    backtrack(res, new ArrayList<>(), nums, 0);
    return res;
  }

  public void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int index) {
    // Add the set to result set
    res.add(new ArrayList<>(temp));
    for (int i = index; i < nums.length; i++) {
      // Case of including the number
      temp.add(nums[i]);
      // Backtrack the new subset
      backtrack(res, temp, nums, i + 1);
      // Case of not-including the number
      temp.remove(temp.size() - 1);
    }
  }
}
