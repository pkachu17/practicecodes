/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
var isSameTree = function(p, q) {
//     var arr_p =[];
//     var arr_q = [];
    
    
    
//     traversal_p(p);
//     traversal_q(q);
    
//     function traversal_p(root){
//         if(root==null){
//             arr_p.push(root);
//             return;
//         }
//         traversal_p(root.left);
//         arr_p.push(root.val);
//         traversal_p(root.right);
//     }
    
//     function traversal_q(root){
//         if(root==null){
//             arr_q.push(root);
//             return;
//         }
//         traversal_q(root.left);
//         arr_q.push(root.val);
//         traversal_q(root.right);
//     }
//     var nn = JSON.stringify(arr_q)
//     return (JSON.stringify(arr_p)==JSON.stringify(arr_q));
    
    
    if(p==q && q==null){
        return true;
    }
    if(q==null || p == null){
        return false;
    }
    if(p.val != q.val) {
        return false;
    }
    return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    
    
    
};