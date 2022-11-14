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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();
        
        traversal(root, arr);
        
        return isContains(arr,k);
                             
    }
    public void traversal(TreeNode root, List<Integer> arr){
        if(root != null){
            traversal(root.left, arr);
            arr.add(root.val);
            traversal(root.right, arr);
        }
    }
    public boolean isContains(List<Integer> array, int target){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.size(); i++){
            int compliment = target - array.get(i);
            if(map.containsKey(compliment)){
                return true;
            }
            map.put(array.get(i), i);
        }
        return false;
    }
}