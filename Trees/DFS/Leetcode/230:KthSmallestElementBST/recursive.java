class recursive {

  public class recursive(TreeNode root, int k) {
    int[]arr = new int[2];
    arr[0] = k;
    dfs(root, k);
    return arr[1];
  }

  public void dfs(TreeNode root, int[] arr) {
    if(root == null) return;

    dfs(root.left, arr);
    arr[0] -= 1;
    if(arr[0] == 0) {
      temp[1] = root.val;
      return;
    }
    dfs(root.right, arr);
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