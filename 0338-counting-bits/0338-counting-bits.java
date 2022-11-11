class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, 0);
        arr[0] = 0;
        for(int i=1; i<n+1; i++){
            arr[i] = hammingDistance(i);
        }
        return arr;
    }
    
    public int hammingDistance(int i){
        int result =0;
        while(i!=0){
            i = i & (i-1);
            result++;
        }
        return result;
    }
}