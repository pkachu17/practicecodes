/**
 * @param {number} n
 * @return {number}
 */
var arrangeCoins = function(n) {
    var count =0;
    var num =n;
    // if(n==1){
    //     return n;
    // }
 for(var i=1; i<=n;i++){
     count = num-i;
     num = num-i;
     if(num <= i){
         return i;
     }
 }
};