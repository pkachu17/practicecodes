/**
 * @param {string} s
 * @return {number}
 */
var countBinarySubstrings = function(s) {
    var count = 0;
    var i =1;
    var prev = 0;
    var cur = 1;
    
    for (var i=1; i<s.length; i++){
        if(s.charAt(i-1) != s.charAt(i)){
        count += Math.min(prev, cur);
        prev = cur;
        cur = 1;
    }else{
        cur++;
    }
    }
    return count +=Math.min(prev, cur);
    
};