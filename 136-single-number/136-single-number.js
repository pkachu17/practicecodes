/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    var a=0;
    for(var i=0; i<nums.length; i++){
        a = a^nums[i];
    }
    return a;
};