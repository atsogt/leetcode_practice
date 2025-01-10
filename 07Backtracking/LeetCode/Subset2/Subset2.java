package Subset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*LeetCode: https://leetcode.com/problems/subsets-ii/description/
 NeetCode: https://neetcode.io/problems/subsets-ii
 Concept & Explanation: https://neetcode.io/courses/advanced-algorithms/11

 Given an integer array nums that may contain duplicates, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 */

public class Subset2 {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> sub = new ArrayList<>();
    backtracking(0, nums, sub, res); // Backtrack: Remove the last added element
    return res;
  }

  public void backtracking(int i, int[] nums, List<Integer> sub, List<List<Integer>> res) {
    if (i >= nums.length) {
      res.add(new ArrayList<>(sub));
      return;
    }
    // decision to include
    sub.add(nums[i]);
    backtracking(i + 1, nums, sub, res);
    sub.remove(sub.size() - 1);
    // decision not to include
    // Skip duplicate elements to avoid duplicate subsets
    while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
      i++;
    }
    backtracking(i + 1, nums, sub, res);
  }

}
