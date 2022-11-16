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
class Solution {
    public int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        helper(root, Integer.MIN_VALUE);
        return count;
    }
    
    public void helper(TreeNode root, int maxSoFar){
        if(root.val >= maxSoFar) count++;
        if(root.left != null ) helper(root.left, Math.max(root.val, maxSoFar)); 
        if(root.right != null ) helper(root.right, Math.max(root.val, maxSoFar));
    }
}