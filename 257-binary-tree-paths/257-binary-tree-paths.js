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
 * @return {string[]}
 */
var binaryTreePaths = function(root) {
    if(!root) return [];
    const res = [];
     function findPath(node , currentPath){
         currentPath = currentPath + node.val;
         
         if(!node.left && !node.right) res.push(currentPath);
         if(node.left) findPath(node.left, currentPath+ "->");
         if(node.right) findPath(node.right, currentPath+ "->");
     }
    findPath(root, "");
    return res;
};