/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    var total = 0;
    for(var i in nums){
        total = total + nums[i];
    }
    var leftsum = 0;
    //var rightsum = 0;
    for (var j = 0; j<nums.length; j++){
        var rightsum = total - nums[j] - leftsum;
        if(leftsum ==rightsum){
            return j;
        }
        leftsum = leftsum + nums[j];
    }
    return -1;
};