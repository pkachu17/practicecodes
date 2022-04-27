/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} low
 * @param {number} high
 * @return {number}
 */
var rangeSumBST = function(root, low, high) {
    var sum =0;
    
    traversal(root);
    
    function traversal(root){
        
        if(!root){
            return;
        }
        if(low <= root.val && root.val<=high){
            sum += root.val;
        }
        if(low < root.val){
           traversal(root.left);
        }
        if(root.val < high){
            traversal(root.right);
        }
    }
    return sum;
}