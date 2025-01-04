
// Given a binary tree, we want to determine if there exists a path from the root to a leaf node without having a value of 0 in the path. If such a path exists, we return true, otherwise we return false.

public class prob1 {
  public boolean canReachLeaf(TreeNode root) {
    if (root == null || root.val == 0) {
      return false;
    }
    if (root.right == null && root.left == null) {
      return true;
    }
    if (canReachLeaf(root.left)) {
      return true;
    }
    if (canReachLeaf(root.right)) {
      return true;
    }
    return false;
  }
}

class TreeNode {
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