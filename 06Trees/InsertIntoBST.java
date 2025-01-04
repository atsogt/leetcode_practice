class InsertIntoBST {

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

  public TreeNode InsertIntoBST(TreeNode root, int val)

    if (root == null) {
      return new TreeNode(val);
    }

    if (val < root.val) {
      root.left =  InsertIntoBST(root.left, val);
    } else if (val > root.val) {
      root.right =  InsertIntoBST(root.right, val);s
    }
    return root;
  }

}