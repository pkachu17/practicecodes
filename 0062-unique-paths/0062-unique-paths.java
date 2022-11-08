class Solution {
    public int uniquePaths(int m, int n) {
        
//  USING 1D DP TC=M*N SC=N
//         int[] dp = new int[n];
//         Arrays.fill(dp, 1);
        
//         for(int i=1; i<m; i++){
//             for(int j=1; j<n; j++){
//                 dp[j] = dp[j] + dp[j-1];
//             }
//         }
//         return dp[n-1];
        
        int[][] dp = new int[m][n];
        //fill out last row
        for(int j=0; j<n; j++){
            dp[m-1][j] = 1;
        }
        //fill out last column
        for(int i=0; i<m;i++){
            dp[i][n-1] =1;
        }
        
        for(int i=m-2; i>=0; i--){
            for(int j=n-2; j>=0; j--){
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }
        return dp[0][0];
        
        
    }
}