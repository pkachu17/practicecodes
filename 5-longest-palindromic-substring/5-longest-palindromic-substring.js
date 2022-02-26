/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    if(s==null || s.length <1) return "";
    var start =0;
    var end=0;
    for(var i = 0; i<s.length; i++){
        var len1 = expAC(s,i,i);
        var len2 = expAC(s,i,i+1);
        var len = Math.max(len1, len2);
        if(len>end-start){
            start = i -Math.floor((len -1)/2);
            end = i+len/2;
        }
    }
    return s.substring(start, end+1);
};

function expAC(s, left, right){
    var L =left; 
    var R= right;
    while (L >= 0 && R<s.length && s.charAt(L) == s.charAt(R) ){
        L--;
        R++;
    }
    return R-L-1;
}