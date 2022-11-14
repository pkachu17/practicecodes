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
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        helper(root);
        return diameter;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        
        int left = 0, right = 0;
        left = helper(root.left);
        right = helper(root.right);
        diameter = Math.max(diameter, left+right);
        return Math.max(left, right)+1;
    }
}