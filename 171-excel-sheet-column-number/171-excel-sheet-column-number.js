/**
 * @param {string} columnTitle
 * @return {number}
 */
var titleToNumber = function(columnTitle) {
    var result = 0;
    for(var c = 0; c< columnTitle.length; c++){
        var d = columnTitle.charCodeAt(c)- 65 +1;
        result = result*26 + d;
    }
    return result;
};