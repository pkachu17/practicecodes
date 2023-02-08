class Solution {
    public int maxProfit(int[] prices) {
        int j=0, max=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<prices[j]) {j=i; continue;}
            int diff = prices[i] - prices[j];
            max = Math.max(max, diff);
            
        }
        return max;
    }
}