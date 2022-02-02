/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
    var dp = new Array(n+1).fill(0);
    var offset =1;
    for(var i=1; i<n+1; i++){
        if(offset*2==i){
            offset = i;
        }
        dp[i] = 1 + dp[ i - offset];
    }
    return dp;
};