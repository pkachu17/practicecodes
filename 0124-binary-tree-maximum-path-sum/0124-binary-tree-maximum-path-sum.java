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
    int res;
    public int maxPathSum(TreeNode root) {
        res = Integer.MIN_VALUE;
        
        helper(root);
        
        return res;
    }
    
    public int helper(TreeNode r)
    {
        if(r == null)
            return 0;
        
        int lh = helper(r.left);
        int rh = helper(r.right);
        
        res = Math.max(res, r.val);
        res = Math.max(res, r.val + lh + rh);
        res = Math.max(res, r.val + Math.max(lh, rh));
        // res = Math.max(res, r.val + rh);
        
        int re = Math.max(r.val,  r.val + Math.max(lh, rh));
        
        return re;
    }
}