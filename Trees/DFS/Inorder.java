package DFS;

public class Inorder {
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

  // INORDER: LEFT SUBTREE -> ROOT -> RIGHT SUBTREE
  public void Inorder(TreeNode root) {

    // this will hit if when we arrive on the left pointer or the right pointer that
    if (root == null) {
      return;
    }

    // Left side of the tree
    Inorder(root.left);
    // Print root
    System.out.println(root.val);
    // Right side of tree
    Inorder(root.right);
  }
}

// OUTPUT: [2,3,4,5,6,7]