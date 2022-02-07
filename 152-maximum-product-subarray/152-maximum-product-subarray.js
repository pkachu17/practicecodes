/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    var result = Math.max(...nums);
    var curMin =1;
    var curMax = 1;
    var temp = 0;
    
    for (var i=0; i <nums.length; i++){
        if (nums[i]==0){
            curMin = 1;
            curMax = 1;
            continue;
        }
        temp = curMax*nums[i];
        curMax = Math.max(nums[i]*curMax, nums[i]*curMin, nums[i]);
        curMin = Math.min(temp, nums[i]*curMin, nums[i]);
        result = Math.max(result, curMax);
    }
    return result;
    
};