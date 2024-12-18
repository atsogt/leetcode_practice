package DFS;

public class Postorder {

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

  // POSTORDER: LEFT SUBTREE -> RIGHT SUBTREE -> ROOT
  public void Postorder(TreeNode root) {
    // this will hit if when we arrive on the left pointer or the right pointer that
    if (root == null) {
      return;
    }

    // Left side of the tree
    Postorder(root.left);
    // Right side of tree
    Postorder(root.right);
    // Print root
    System.out.println(root.val);
  }

}
