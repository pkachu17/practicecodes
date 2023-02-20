class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left=1, right=1;
        int[] arr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            arr[i] = left;
            left = left*nums[i]; 
        }
        for(int i=nums.length-1; i>=0; i--){
            arr[i] *= right;
            right = right*nums[i];
        }
        
        return arr;
    }
}