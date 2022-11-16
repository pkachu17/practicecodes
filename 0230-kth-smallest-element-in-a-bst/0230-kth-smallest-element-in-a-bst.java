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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        return helper(root, k, arr);
    }
    
    
    public int helper(TreeNode root, int k, ArrayList<Integer> arr){
        if(root != null){
            arr.add(root.val);
        }
        if(root.left != null) helper(root.left, k, arr);
        if(root.right != null) helper(root.right, k, arr);
        Collections.sort(arr);
        int res =0;
        for(int i=0; i<k&&i<arr.size(); i++){
            res = arr.get(i);
        }
        return res;
    }
}