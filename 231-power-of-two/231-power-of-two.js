/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfTwo = function(n) {
    for(var i=0; i<=30; i++){
        if(n==(2**i))
            return true;
    }
    return false;
}