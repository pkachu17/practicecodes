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
    List<List<Integer>> res = new ArrayList<>();;
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root == null)return res;
        
        helper(root, 0);
        
        return res;
    }
    public void helper(TreeNode root, int level)
    {
        // if(root == null) return;
        if(level == res.size())
        {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        
        if(root.left != null)
        {
            helper(root.left, level + 1);   
        }
        
        if(root.right != null)
        {
            helper(root.right, level + 1);
        }
        
        // return;
    }
}