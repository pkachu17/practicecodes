/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    var l= 0;
    var r =1;
    
    for (var i=0; i<nums.length; i++){
        if(r>=nums.length){
            r=nums.lenght-1;
        }
        if(nums[l]==nums[r]){
            r++;
        }else {
            nums[l+1] = nums[r];
            l++;
            r++;
        }    
    }
    return l;
};