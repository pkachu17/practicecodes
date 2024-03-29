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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Traversal(root, arr);
        return arr;
    }
    
    public void Traversal(TreeNode root, ArrayList<Integer> arr){
        if (root!=null){
            Traversal(root.left, arr);
            arr.add(root.val);
            Traversal(root.right, arr);
        }
    }
}