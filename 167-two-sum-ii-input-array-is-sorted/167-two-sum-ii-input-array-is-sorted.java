class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0, r=numbers.length-1;
        while(l<r){
            int cur = numbers[l] + numbers[r];
            if(cur == target) return new int[]{l+1, r+1};
            else if(cur>target) r--;
            else l++;
        }
        return new int[]{-1,-1};
    }
}