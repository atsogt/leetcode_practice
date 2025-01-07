import java.util.ArrayList;

// Building the Path
// Let's take a look at a slight variation of the question where instead of just returning true or false, we also build the path if it exists. The path should contain the values of the root to leaf path in the order they are visited.
public class prob2 {
  public boolean start(TreeNode root) {
    // to keep track of data, we must pass it in as a reference
    ArrayList<Integer> path = new ArrayList<>();
    leafPath(root, path);
    return false;
  }

  public boolean leafPath(TreeNode root, ArrayList<Integer> path) {
    // if root is null or root.val is zero, return false
    if (root == null || root.val == 0) {
      return false;
    }
    // we add it to our path and traverse children to see if path is legitimate
    path.add(root.val);
    // is our node a leaf node?
    if (root.left == null && root.right == null) {
      return false;
    }
    // if our node is not leaf node, traverse left subtree as we add and explore its
    // descendants
    if (leafPath(root.left, path)) {
      return true;
    }
    // if left subtree invalid? traverse right subtree as we add and explore its
    // descendants
    if (leafPath(root.right, path)) {
      return true;
    }
    // if both sides strike out, we remove the parent node and backtrack up!
    path.remove(path.size() - 1);
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