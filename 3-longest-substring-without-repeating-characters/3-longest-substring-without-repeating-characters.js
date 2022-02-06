/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    var charSet = new Set();
    var l =0;
    var result =0;
    var res=0;
    
    for(var i=0; i<s.length; i++){
        while(charSet.has(s[i])){
            charSet.delete(s[l]);
            l=l+1;
        }
        charSet.add(s[i]);
        res = i-l+1;
        result = Math.max(result,res);
    }
    return result;
};