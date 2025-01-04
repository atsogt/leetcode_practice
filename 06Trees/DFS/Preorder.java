package DFS;

class Preorder {
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

  // PREORDER: ROOT -> LEFT SUBTREE -> RIGHT SUBTREE
  public void Preorder(TreeNode root) {
    // this will hit if when we arrive on the left pointer or the right pointer that
    if (root == null) {
      return;
    }
    // printing root first
    System.out.println(root.val);
    // then left side of the tree
    Preorder(root.left);
    // then right side of tree
    Preorder(root.right);
  }
}

// OUTPUT: [4,3,2,6,5,7]
