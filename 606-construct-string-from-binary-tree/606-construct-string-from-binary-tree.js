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
 * @return {string}
 */
var tree2str = function(root) {
    if(!root) return "";
    let t = root;
    
    let res = ""+t.val+"";
    if (t.left && t.right) res += '(' + tree2str(t.left) + ')(' + tree2str(t.right) + ')';
    else if(t.left) res+= '(' + tree2str(t.left) + ')';
    else if(t.right) res+= '()(' + tree2str(t.right)+ ')';
    return res;
};