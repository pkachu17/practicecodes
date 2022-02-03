/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    var count =0;
    var result = null;
    for(var i=0; i<nums.length; i++){
        if (count ==0){
            result = nums[i];
        }
        count += (nums[i] ==result)?1:-1;
    }
    return result
};