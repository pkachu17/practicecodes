/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    var rob1 =0;
    var rob2 = 0;
    var temp=0;
    
    for(var i=0; i<nums.length; i++){
        temp = Math.max(nums[i]+ rob1, rob2);
        rob1= rob2;
        rob2 = temp;
    }
    return rob2;
};