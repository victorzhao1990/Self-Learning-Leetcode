/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

public class Solution {
  ArrayList<ArrayList<Integer>> res;
  public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    if (root == null) {
      return null;
    }
    res = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> r = new ArrayList<Integer>();
    dfs(root, sum - root.val, r);
    return res;
  }

  private void dfs(TreeNode root, int currSum, ArrayList<Integer> r) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null && sum == 0) {
      res.add(new ArrayList<Integer>(r));
      return;
    }

    if (root.left != null) {
      r.add(root.left.val);
      dfs(root.left, sum - root.left.val, r);
      r.remove(r.size() - 1);
    }

    if (root.right != null) {
      r.add(root.right.val);
      dfs(root.right, sum - root.right.val, r);
      r.remove(r.size() - 1);
    }
  }
}
