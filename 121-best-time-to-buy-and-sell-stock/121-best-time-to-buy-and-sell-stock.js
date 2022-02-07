/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    var curMax = 0;
    var finalMax = 0;
    var l = 0;
    var r = 1;
    
    while(r < prices.length){
        if(prices[l]<prices[r]){
            curMax = prices[r] - prices[l];
            finalMax = Math.max(finalMax, curMax);
        }else{l=r};
        r=r+1;
    }
    return finalMax;
};