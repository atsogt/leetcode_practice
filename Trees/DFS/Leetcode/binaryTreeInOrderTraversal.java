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

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> arr = new ArrayList<>();

    inorder(root, arr);
    return arr;
  }

  public void inorder(TreeNode root, List<Integer> arr) {

    if (root == null)
      return;

    inorder(root.left, arr);
    arr.add(root.val);
    inorder(root.right, arr);
  }
}
