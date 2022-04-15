/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root1
 * @param {TreeNode} root2
 * @return {TreeNode}
 */
var mergeTrees = function(root1, root2) {
    return merge(root1, root2)
};

function merge(t1, t2){
    if(t1 ==null && t2==null) return null;
    
    if(t1==null && t2 != null) return t2;
    
    if(t1 != null && t2 ==null) return t1;
    
    let sum = new TreeNode(t1.val + t2.val);
    
    sum.left = merge(t1.left, t2.left);
    sum.right = merge(t1.right, t2.right);
    
    return sum;
}