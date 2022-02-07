/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    var left = 0;
    var right = matrix[0].length-1;
    
    while (left < right){
        for(var i = 0; i<(right - left); i++){
            var top = left;
            var bottom = right;
            
            var topleft = matrix[top][left+i];
            
            matrix[top][left+i] = matrix[bottom-i][left];
            
            matrix[bottom-i][left] = matrix[bottom][right-i];
            
            matrix[bottom][right-i] = matrix[top+i][right];
            
            matrix[top+i][right] = topleft;
        }
        right = right-1;
        left = left+1;
    }
};