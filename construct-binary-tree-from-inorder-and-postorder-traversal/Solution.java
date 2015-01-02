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
   public TreeNode buildTree(int[] inorder, int[] postorder) {
     if ((inorder == null) || (postorder == null) || (inorder.length == 0) || (postorder.length == 0)) {
       return null;
     }

     HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

     for (int i = 0; i < inorder.length; i++) {
       hs.put(inorder[i], i);
     }

     TreeNode root = buildTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1, hs);

     return root;
   }

   private TreeNode buildTree(int[] inorder, int[] postorder, int inL, int inR, int posL, int posR, HashMap<Integer, Integer> hs) {
     if ((inL > inR) || (posL > posR)) {
       return null;
     }
     int index = hs.get(postorder[posR]);
     TreeNode root = new TreeNode(postorder[posR]);
     root.left = buildTree(inorder, postorder, inL, index - 1, posL, posL + index - inL - 1, hs);
     root.right = buildTree(inorder, postorder, index + 1, inR, posR - (inR - index), posR - 1, hs);
     return root;
   }
 }
