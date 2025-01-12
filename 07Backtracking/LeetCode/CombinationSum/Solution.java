package CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * You are given an array of distinct integers nums and a target integer target. Your task is to return a list of all unique combinations of nums where the chosen numbers sum to target.

The same number may be chosen from nums an unlimited number of times. Two combinations are the same if the frequency of each of the chosen numbers is the same, otherwise they are different.

You may return the combinations in any order and the order of the numbers in each combination can be in any order.

Example 1:

Input: 
nums = [2,5,6,9] 
target = 9

Output: [[2,2,5],[9]]
Explanation:
2 + 2 + 5 = 9. We use 2 twice, and 5 once.
9 = 9. We use 9 once.

Example 2:

Input: 
nums = [3,4,5]
target = 16

Output: [[3,3,3,3,4],[3,3,5,5],[4,4,4,4],[3,4,4,5]]
Example 3:

Input: 
nums = [3]
target = 5

Output: []
 */

//Non optimal Backtracking
public class Solution {
  List<List<Integer>> res;

  public List<List<Integer>> combinationSum(int[] nums, int target) {
    res = new ArrayList<List<Integer>>();
    List<Integer> cur = new ArrayList();
    backtrack(nums, target, cur, 0);
    return res;
  }

  public void backtrack(int[] nums, int target, List<Integer> cur, int i) {
    if (target == 0) {
      res.add(new ArrayList(cur));
      return;
    }
    if (target < 0 || i >= nums.length) {
      return;
    }

    cur.add(nums[i]);
    // index stays the same if we were to traverse the tree using the same element
    backtrack(nums, target - nums[i], cur, i);
    // we use the same element but we don't add anymore
    cur.remove(cur.size() - 1);
    // we traverse to the sub tree where we don't use the element and move onto the
    // next element
    backtrack(nums, target, cur, i + 1);
  }
}
