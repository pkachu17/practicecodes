class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left =0;
        int ans =0;
        long sum =0;
        for(int right =0; right<nums.length; right++){
            sum = sum + nums[right];
            while( k < nums[right] * 1L * (right-left+1) - sum){
                sum = sum - nums[left];
                left++;
            }
            ans = Math.max(ans, (right-left+1));
        }
        return ans;
    }
}