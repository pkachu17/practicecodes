/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    var left = binarySearch(nums, target, true);
    var right = binarySearch(nums, target, false);
    return [left, right];
    
    function binarySearch(nums, target, leftBias){
        var l=0;
        var r=nums.length-1;
        var i=-1;
        
        while(l<=r){
            var m = Math.floor((l+r)/2);
            if(target>nums[m]){
                l=m+1;
            }else if(target<nums[m]){
                r=m-1;
            }else{
                i=m;
                if(leftBias){
                    r=m-1;
                }else{
                    l=m+1;
                }
            }
        }
        return i;
    }
};