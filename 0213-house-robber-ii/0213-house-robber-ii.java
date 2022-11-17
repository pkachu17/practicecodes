class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        
        int[] dp1 = new int[ nums.length];
        int[] dp2 = new int[ nums.length];
        
        dp1[0] = 0;
        dp1[1] = nums[1];
        
        
        int max = Integer.MIN_VALUE;
        
        max = Math.max(max, dp1[1]);
        
        dp2[0] = nums[0];
        dp2[1] = Math.max(nums[0], nums[1]);
        max = Math.max(max, dp2[1]);
    
        for(int i=2; i<nums.length; i++){
            dp1[i] = Math.max(dp1[i-1], dp1[i-2]+nums[i]);
            max = Math.max(max, dp1[i]);
                         System.out.println(dp1[i] + " max "+ max);
        }

        
        for(int i=2; i<nums.length - 1; i++){
            dp2[i] = Math.max(dp2[i-1], dp2[i-2]+nums[i]);
            max = Math.max(max, dp2[i]);
             System.out.println(dp2[i] + " max "+ max);
        }
        
        
        return max;
    }
}