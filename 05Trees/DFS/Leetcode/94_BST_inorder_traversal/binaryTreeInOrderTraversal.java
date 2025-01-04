package DFS.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class binaryTreeInOrderTraversal {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  // Inorder: left node -> parent node -> right node
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> arr = new ArrayList<>();
    inorder(root, arr);
    return arr;
  }

  public void inorder(TreeNode root, List<Integer> arr) {
    // recursive base case if root is null, pop from stack
    if (root == null)
      return;
    // recursively traver to the left side
    inorder(root.left, arr);
    // add to list
    arr.add(root.val);
    // recursively traver to the right side
    inorder(root.right, arr);
  }
}
