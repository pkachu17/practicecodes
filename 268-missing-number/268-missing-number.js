/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    var sum1 = 0;
    var sum2 = 0;
    var count =0;
    for (var i=0; i<nums.length; i++){
        sum1 += nums[i];
    }
    for(var j=0; j<=nums.length; j++){
        sum2 += j;
    }
    return sum2-sum1;
    
};