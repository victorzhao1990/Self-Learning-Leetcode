/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.HashMap;

class TreeNode {
      int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] preOrder) {
        if ((inorder == null) || (preOrder == null) || (inorder.length == 0) || (preOrder.length == 0)) {
            return null;
        }

        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

        for (int i = 0; i < inorder.length; i++) {
            hs.put(inorder[i], i);
        }

        TreeNode root = buildTree(inorder, preOrder, 0, inorder.length - 1, 0, preOrder.length - 1, hs);

        return root;
    }

    private TreeNode buildTree(int[] inorder, int[] preOrder, int inL, int inR, int preL, int preR, HashMap<Integer, Integer> hs) {
        if ((inL > inR) || (preL > preR)) {
            return null;
        }
        System.out.println("preL is " + preL);
        int index = hs.get(preOrder[preL]);
        TreeNode root = new TreeNode(preOrder[preL]);
        root.left = buildTree(inorder, preOrder, inL, index - 1, preL + 1, preL + index - inL, hs);
        root.right = buildTree(inorder, preOrder, index + 1, inR, preR - (inR - index) + 1, preR, hs);
        return root;
    }

    public static void main(String[] args) {
      int[] in = {1, 2, 3};
      int[] pre = {2, 3, 1};
      System.out.println((new Solution()).buildTree(in, pre));
    }
}
