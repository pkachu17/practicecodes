/**
 * @param {number} num
 * @return {boolean}
 */
var isPerfectSquare = function(num) {
    var mid = Math.round(num/2);
    for(var i=0; i<num/2; i++){
        if((mid*mid)==num){
            return true;
        }else if((mid*mid)<num){
            mid=mid+1;
        }else{
            mid = mid-1;
        }
    }
    return false;
};