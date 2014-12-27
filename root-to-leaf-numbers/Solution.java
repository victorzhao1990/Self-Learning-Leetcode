/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * http://www.geeksforgeeks.org/sum-numbers-formed-root-leaf-paths/
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);
    }
    private int sumNumbersHelper(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int pathVal = root.val + sum * 10;
        if ((root.left == null) && (root.right == null)) {
            return pathVal;
        }
        return sumNumbersHelper(root.left, pathVal) + sumNumbersHelper(root.right, pathVal);
    }
}
