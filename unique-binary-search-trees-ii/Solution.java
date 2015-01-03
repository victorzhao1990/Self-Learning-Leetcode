/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
 // http://blog.csdn.net/linhuanmars/article/details/24761437
public class Solution {
    public List<TreeNode> generateTrees(int n) {
      return buildTree(1, n);
    }

    private ArrayList<TreeNode> buildTree(int left, int right) {
      ArrayList<TreeNode> res = new ArrayList<TreeNode>();
      if (left > right) {
        res.add(null);
        return res;
      }

      for (int i = left; i <= right; i++) {
        ArrayList<TreeNode> leftList = buildTree(left, i - 1);
        ArrayList<TreeNode> rightList = buildTree(i + 1, right);
        for (int j = 0; j < leftList.size(); j++) {
          for (int k = 0; k < rightList.size(); k++) {
            TreeNode root = new TreeNode(i);
            root.left = leftList.get(j);
            root.right = rightList.get(k);
            res.add(root);
          }
        }
      }
      return res;
    }
}
