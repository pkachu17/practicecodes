/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    var n = s.trim();
   var words = n.split(" ");
    var res = words[words.length -1];
    return res.length;
};