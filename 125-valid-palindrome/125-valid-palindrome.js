/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
 var letters = "";
 for(var i=0; i<s.length; i++){
     if(s[i].match(/[0-9]/g) || s[i].match(/[A-Z]/gi)){
         letters += s[i];
     }
 }
    var fixed_string = letters.toLowerCase();
    var l = 0;
    var r = fixed_string.length -1;
    for(var j=0; j<= r; j++){
        if(fixed_string[l] != fixed_string[r]){
            return false;
        }
        l =l+1;
        r = r-1;
    }
    return true;
};