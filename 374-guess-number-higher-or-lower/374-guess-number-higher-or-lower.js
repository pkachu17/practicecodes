/** 
 * Forward declaration of guess API.
 * @param {number} num   your guess
 * @return 	            -1 if num is lower than the guess number
 *			             1 if num is higher than the guess number
 *                       otherwise return 0
 * var guess = function(num) {}
 */

/**
 * @param {number} n
 * @return {number}
 */
var guessNumber = function(n) {
    var l = 1;
    var r = n;
    
    while (1){
        var m = Math.floor((l+r)/2);
        var result = guess(m);
        if(result>0){
            l = m+1;
        }else if(result<0){
            r = m-1;
        }else{
            return m;
        }
    }
};