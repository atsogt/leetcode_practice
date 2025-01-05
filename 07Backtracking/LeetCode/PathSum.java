// https://leetcode.com/problems/path-sum/
// Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

// A leaf is a node with no children.

import java.nio.file.Paths;

public class PathSum {
  public boolean PathSum(TreeNode node, int targetSum) {
    // base case if Node is null
    if (node == null)
      return false;
    // if node is not null, subtract value from targetSum
    targetSum -= node.val;
    // check if we're at leaf node
    if (node.left == null && node.right == null) {
      // if targetSum is 0, then we have reached out target
      // return true
      return targetSum == 0;
    }
    // recursive call with conditional logic
    return PathSum(node.left, targetSum) || PathSum(node.right, targetSum);
  }

}
