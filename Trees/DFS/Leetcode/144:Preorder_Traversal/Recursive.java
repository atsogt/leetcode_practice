// https://leetcode.com/problems/binary-tree-preorder-traversal/description/

// Given the root of a binary tree, return the preorder traversal of its nodes' valrues.

public class Recursive {
  public List<Integer> preOrderTraversal() {
    List<Integer> arr = new ArrayList<>();
    helper(root, arr);
    return arr;
  }

  public void helper(TreeNode root, List<Integer> arr) {
    if (root == null)
      return;
    arr.add(root.val);
    helper(root.left, arr);
    helper(root.right, arr);
  }
}
