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
    public ArrayList<Integer> arr = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k);
    }
    public int helper(TreeNode node, int k){
        if(node != null) arr.add(node.val);
        if(node.left !=null) helper(node.left, k);
        if(node.right!=null) helper(node.right, k);
        Collections.sort(arr);
        int res=0;
        for(int i=0; i<k&&i<arr.size(); i++){
            res=arr.get(i);
        }
        return res;
    }
}