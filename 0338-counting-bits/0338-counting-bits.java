class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0; i<=n; i++){
            arr[i] = hammingDistance(i);
        }
        return arr;
    }
    
    public int hammingDistance(int i){
        int res =0;
        while(i!=0){
            i = i&(i-1);
            res++;
        }
        return res;
    }
}