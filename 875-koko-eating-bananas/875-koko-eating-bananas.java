class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1, right=1;
        for(int pile: piles){
            right = Math.max(right, pile);
        }
        while(left<right){
            int mid = (left+right)/2;
            int hourspent =0;
            for(int pile: piles){
                hourspent += Math.ceil((double) pile/mid);
            }
            if(hourspent<=h){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return right;
    }
}