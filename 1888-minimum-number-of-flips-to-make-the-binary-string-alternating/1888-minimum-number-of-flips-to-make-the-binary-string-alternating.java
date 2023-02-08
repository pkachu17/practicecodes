class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int misMatchCount = 0;
        int minFlip = Integer.MAX_VALUE;
        for(int i=0; i<n*2; i++){
            int r = i%n;
            if((s.charAt(r) - '0' ) != ( i%2 == 0? 1:0 )) misMatchCount++;
            if( i>=n && (s.charAt(r) - '0') != ( r%2 == 0 ? 1:0 )) misMatchCount--;
            if( i>= n-1) minFlip = Math.min(minFlip, Math.min(misMatchCount, n-misMatchCount));
        }
        return minFlip;
    }
}