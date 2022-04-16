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
 * @return {number}
 */
var findSecondMinimumValue = function(root) {
    var minV = root.val;
    var res = Number.MAX_SAFE_INTEGER;
    var dfs = function(node){
        if(!node) return;
        if(node.val ==minV){
            dfs(node.left);
            dfs(node.right);
        }else if(node.val>minV && node.val <res){
            res = node.val;
        }
    }
    dfs(root);
    return res==Number.MAX_SAFE_INTEGER?-1:res;
};