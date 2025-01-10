import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> sub = new ArrayList<>();
    backtracking(0, nums, sub, res);
    return res;
  }

  public void backtracking(int i, int[] nums, List<Integer> sub, List<List<Integer>> res) {
    if (i >= nums.length) {
      res.add(new ArrayList<>(sub));
      return;
    }
    sub.add(nums[i]);
    backtracking(i + 1, nums, sub, res);
    sub.remove(sub.size() - 1);
    while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
      i++;
    }
    backtracking(i + 1, nums, sub, res);
  }

}
