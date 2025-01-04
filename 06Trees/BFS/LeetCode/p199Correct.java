package BFS.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p199Correct {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root); // if null gets added, line 20 and 26 would not hit

    while (!q.isEmpty()) {
      // empty null
      TreeNode rightSide = null;
      // size needs to be declared because it will change size as child node gets
      // added (if child exists)
      int qLen = q.size();

      for (int i = 0; i < qLen; i++) {
        // removal from queue
        TreeNode node = q.poll();
        if (node != null) {
          // right side captured
          rightSide = node;
          // child added to queue
          q.offer(node.left);
          q.offer(node.right);
        }
      }
      // outside of the for loop, because rightside will always get the right child
      // element in each level
      if (rightSide != null) {
        // added to array
        res.add(rightSide.val);
      }
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
