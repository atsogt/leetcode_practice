package Trees.BFS.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//102. Binary Tree Level Order Traversal
// https://leetcode.com/problems/binary-tree-level-order-traversal/description/

/*  Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Input: root = [1]
Output: [[1]]

Input: root = []
Output: []
*/
public class prob102 {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    // each node gets added, then popped off, then children added (if they exist)
    Queue<TreeNode> q = new LinkedList<>();
    if (root != null)
      q.add(root);
    while (!q.isEmpty()) {
      // each level in tree has it's own array
      List<Integer> arr = new ArrayList<>();
      // queue size needs to be added or else it will incrase as you add more child
      // nodes
      int qSize = q.size();
      // iterate through queue while removing node and then adding child node to queue
      // for processing
      for (int i = 0; i < qSize; i++) {
        TreeNode curr = q.remove();
        if (curr.left != null) {
          q.add(curr.left);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
        // value of node is added at the end of iteration... from left -> right
        arr.add(curr.val);
      }
      // each array is added as we progress deeper into tree level
      res.add(arr);
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
