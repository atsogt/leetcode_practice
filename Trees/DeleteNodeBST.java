public class DeleteNodeBST {

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

  public TreeNode findMinVal(TreeNode root) {
    TreeNode curr = root;
    while (curr != null && curr.left != null) {
      curr = curr.left;
    }
    return curr;
  }

  public TreeNode DeleteNodeBST(TreeNode root, int val) {

    if (root == null)
      return null;

    if (val < root.val) {
      root.left = DeleteNodeBST(root.left, val);
    } else if (val > root.val) {
      root.right = DeleteNodeBST(root.right, val);
    } else {
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      } else {
        TreeNode min = findMinVal(root.right);
        root.val = min.val;
        root.right = DeleteNodeBST(root.right, min.val);
      }
    }

    return root;
  }
}
