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
    public boolean isValidBST(TreeNode root) {
      return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValid(TreeNode root, int min, int max) {
      if (root == null) {
        return true;
      }

      if ((root.val > max) || (root.val < min)) {
        return false;
      }

      return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }

    public static void main(String[] args) {
      TreeNode root = new TreeNode(2147483647);
      System.out.println((new Solution()).isValidBST(root) + " " + Integer.MAX_VALUE);
    }
}
