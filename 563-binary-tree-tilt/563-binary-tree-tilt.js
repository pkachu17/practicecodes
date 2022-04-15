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
var findTilt = function(root) {
    const getTilt = (node) => {
        if(!node) return [0,0];
        
        const rightTilt = getTilt(node.right);
        const leftTilt = getTilt(node.left);
        
        return [Math.abs(rightTilt[1] - leftTilt[1]) + rightTilt[0] + leftTilt[0], rightTilt[1] + leftTilt[1] + node.val]
    }
    return getTilt(root)[0];
};