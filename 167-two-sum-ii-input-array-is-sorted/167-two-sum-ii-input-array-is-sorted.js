/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    var l = 0;
    var r = numbers.length-1;
    var res = [];
    var n = numbers[0];
    
    for(var i=0; i<numbers.length-1; i++){
        if((numbers[l]+numbers[r])===target){
            res.push(l+1);
            res.push(r+1);
            return res;
        }
        if((numbers[l]+numbers[r])>target){
            r = r-1;
        }else{
            l=l+1;
        }
    }
};