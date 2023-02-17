class Solution {
    public int maxProfit(int[] prices) {
        int i=0, max=0;
        for(int j=1; j<prices.length; j++){
            if(prices[j]<prices[i]){
                i=j;
                continue;
            }
            int diff = prices[j] - prices[i];
            max = Math.max(max, diff);
        }
        return max;
    }
}