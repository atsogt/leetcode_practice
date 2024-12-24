package Trees.BFS;

import java.util.ArrayDeque;
import java.util.Deque;

public class BFS {

  public void bfs(TreeNode root) {
    Queue<TreeNode> queue = new Queue();
  }

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
}

// public void bfs(TreeNode root) {
// Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
// if (root != null) {
// queue.add(root);
// }
// int level = 0;
// while (!queue.isEmpty()) {
// System.out.print("level " + level + ": ");
// int levelLength = queue.size();
// for (int i = 0; i < levelLength; i++) {
// TreeNode curr = queue.removeFirst();
// System.out.print(curr.val + " ");
// if (curr.left != null) {
// queue.add(curr.left);
// }
// if (curr.right != null) {
// queue.add(curr.right);
// }
// }
// level++;
// System.out.println();
// }
// }
