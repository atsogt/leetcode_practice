package Subset;
/*
https://leetcode.com/problems/subsets/
Given an integer array nums of unique elements, return all possible 
subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
*/

import java.util.ArrayList;
import java.util.List;

public class Subset {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> res = new ArrayList<>(); // Result list to store all subsets
    List<Integer> subset = new ArrayList<>(); // Current subset being explored

    dfs(nums, 0, res, subset); // Start DFS from the beginning of the array
    return res;
  }

  public void dfs(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
    // Base case: Reached the end of the array
    if (index == nums.length) {
      res.add(new ArrayList<>(subset)); // Add a copy of the current subset to the result
      return;
    }

    // Include the current element in the subset
    subset.add(nums[index]);
    dfs(nums, index + 1, res, subset);

    // Exclude the current element from the subset (backtracking)
    subset.remove(subset.size() - 1);
    dfs(nums, index + 1, res, subset);
  }
}
