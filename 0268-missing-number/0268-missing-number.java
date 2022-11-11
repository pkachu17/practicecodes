class Solution {
    public int missingNumber(int[] nums) {
        // calculate total = length * (length+1)/2  then sum all arr elements then return total - sum
        int sum = 0;
        int total = nums.length * (nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return total - sum;
    }
}