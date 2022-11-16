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
    public ArrayList<Integer> temp = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        helper(root, 0);
        return temp;
    }
    
    public void helper(TreeNode root, int level){
        if(root == null) return;
        if(temp.size() > level){
            temp.set(level, root.val);
        }else{
            temp.add(root.val);
        }
        helper(root.left, level+1);
        helper(root.right, level+1);
    }
}