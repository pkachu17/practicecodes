/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution{
    public int count=0;
    public int goodNodes(TreeNode root) {
        helper(root, Integer.MIN_VALUE);
        return count;
    }

    public void helper(TreeNode root, int maxsofar){
        if(maxsofar <= root.val) count++;
        if(root.right!=null) helper(root.right, Math.max(root.val, maxsofar));
        if(root.left!=null) helper(root.left, Math.max(root.val, maxsofar));
    }
}