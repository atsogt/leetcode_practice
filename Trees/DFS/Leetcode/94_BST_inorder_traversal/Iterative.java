
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative {
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
    // Inorder: left node -> parent node -> right node
    ArrayList<Integer> arr = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;

    while (curr != null || !stack.isEmpty()) {
      // imitading the recursive call stack
      while (curr != null) {
        // each time we traverse down left, the node gets added to stack
        stack.push(curr);
        curr = curr.left;
      }
      // pop it off from the stack
      curr = stack.pop();
      // remember to add value, not node
      arr.add(curr.val);
      // go to the right
      curr = curr.right;
    }
    return arr;
  }
}
