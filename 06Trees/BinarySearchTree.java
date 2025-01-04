public class BinarySearchTree {

  public class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  public Node BinarySearchTree(Node root, int val) {
    if (root == null)
      return null;

    if (val > root.val) {
      return BinarySearchTree(root.right, val);
    } else if (val < root.val) {
      return BinarySearchTree(root.left, val);
    } else {
      return root;
    }
  }
}
