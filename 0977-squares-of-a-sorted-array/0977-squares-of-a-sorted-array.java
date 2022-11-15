class Solution {
    public int[] sortedSquares(int[] nums) {
        int i =0, j= nums.length-1, k = nums.length;
        int[] arr = new int[k];
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                arr[k-1] = nums[i]*nums[i];
                i++;
                k--;
            }else{
                arr[k-1] = nums[j]*nums[j];
                j--;
                k--;
            }
        }
        return arr;
    }
}