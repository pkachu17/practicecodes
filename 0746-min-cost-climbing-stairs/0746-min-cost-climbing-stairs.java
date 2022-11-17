class Solution {
    public int minCostClimbingStairs(int[] cost) {
//         int[] res = new int[cost.length+1];
//         res[cost.length] = 0;
//         res[cost.length-1] = cost[cost.length-1];
//         for(int i = cost.length-2; i>=0; i--){
//             res[i] = (res[i+1]<res[i+2]) ? res[i+1] + cost[i] : res[i+2] + cost[i];
//         }
        
//         for(int i=0; i<res.length; i++){
//             System.out.println(res[i]+",");
//         }
        
//         return Math.min(res[0], res[1]);
        
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = cost[0];
        for(int i=2; i<=cost.length; i++){
            dp[i] = (dp[i-1]<dp[i-2]) ? dp[i-1] +cost[i-1] : dp[i-2] + cost[i-1];
        }
        for(int i=0; i<dp.length; i++){
            System.out.println(dp[i]+",");
        }
        return Math.min(dp[cost.length], dp[cost.length-1]);
    }
}