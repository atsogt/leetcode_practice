
// Given a binary tree, we want to determine if there exists a path from the root to a leaf node without having a value of 0 in the path. If such a path exists, we return true, otherwise we return false.

public class prob1 {
  public boolean canReachLeaf(TreeNode root) {
    // checking if root is null or root is NOT 0
    if (root == null || root.val == 0) {
      return false;
    }
    // Does root have children, if NOT return true
    if (root.left == null && root.right == null) {
      return true;
    }
    // Traversing left subtree of root (recursivesly)
    if (canReachLeaf(root.left)) {
      return true;
    }
    // Then traversing right subtree (recursivesly)
    if (canReachLeaf(root.right)) {
      return true;
    }
    // Base Case
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