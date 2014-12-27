/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == q) && (p == null)) {
            return true;
        } else

            if (((p == null) && (q != null)) || ((p != null) && (q == null)) || (p.val != q.val)) {
                return false;
            }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}
