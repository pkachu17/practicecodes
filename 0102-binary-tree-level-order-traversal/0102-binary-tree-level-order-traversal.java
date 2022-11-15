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
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> res = new ArrayList();
//         helper(root, res, 0);
//         return res;
//     }
//     public void helper(TreeNode root, List<List<Integer>> res, int level){
//         if(root == null) return;
//         if(res.size() == level){
//             res.add(new ArrayList<>());
//         }
        
//         res.get(level).add(root.val);
        
//         if(root.left != null){
//             helper(root.left, res, level+1);
//         }
//         if(root.right != null){
//             helper(root.right, res, level+1);
//         }
//     }
// }


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode element = q.remove();
                temp.add(element.val);
                if(element.left != null){
                    q.add(element.left);
                }
                if(element.right != null){
                    q.add(element.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}