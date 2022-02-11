/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    
    var pointer1 = m-1;
    var pointer2 = n-1;
    
    for(var p = m+n-1; p>=0; p--){
        if(pointer2 < 0){
            break;
        }
        if(pointer1 >= 0 && nums1[pointer1] > nums2[pointer2]){
            nums1[p] = nums1[pointer1--];
            
        }else{
            nums1[p] = nums2[pointer2--];
        }
    }
    
};