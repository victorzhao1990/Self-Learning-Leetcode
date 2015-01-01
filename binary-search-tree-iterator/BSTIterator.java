/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// http://bookshadow.com/weblog/2014/12/31/leetcode-binary-search-tree-iterator/

import java.util.Stack;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

public class BSTIterator {

  private Stack<TreeNode> left;

  public BSTIterator(TreeNode root) {
    left = new Stack<TreeNode>();
    this.pushLeft(root);
  }

  /** @return whether we have a next smallest number */
  public boolean hasNext() {
    return !left.isEmpty();
  }

  /** @return the next smallest number */
  public int next() {
    TreeNode top = left.pop();
    System.out.println("right is" + top);
    this.pushLeft(top.right);
    return top.val;
  }

  private void pushLeft(TreeNode root) {
    while (root != null) {
      this.left.push(root);
      root = root.left;
    }
  }

  public static void main(String[] args) {
    BSTIterator i = new BSTIterator(new TreeNode(1));
    while (i.hasNext()) {
      int val = i.next();
      System.out.println(val);
    }
  }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
