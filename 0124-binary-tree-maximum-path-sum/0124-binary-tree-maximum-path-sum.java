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
    public int sum =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return sum;
    }
    
    public int helper(TreeNode node){
        if(node == null) return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        
        sum = Math.max(sum, node.val);
        sum = Math.max(sum, node.val+left+right);
        sum = Math.max(sum, node.val + Math.max(left, right));
        int res = Math.max(node.val, node.val+Math.max(left, right));
        return res;
    }
}