package BFS.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p199 {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();

    if (root != null)
      q.add(root);

    while (!q.isEmpty()) {
      List<Integer> arr = new ArrayList<>();
      int qSize = q.size();
      for (int i = 0; i < qSize; i++) {
        TreeNode curr = q.remove();
        if (curr.left != null)
          q.add(curr.left);
        if (curr.right != null)
          q.add(curr.right);
        arr.add(curr.val);
      }
      res.add(arr.get(arr.size() - 1));

    }
    return res;
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
