package DFS.Leetcode;

import java.util.ArrayList;

public class KthSmallest {

  public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> arr = new ArrayList<>();
    dfs(root, arr);
    return arr.get(k - 1);
  }

  public void dfs(TreeNode curr, ArrayList<Integer> arr) {
    if (curr == null)
      return;

    dfs(curr.left, arr);
    arr.add(curr.val);
    dfs(curr.right, arr);
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
