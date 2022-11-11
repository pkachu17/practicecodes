class Solution {
    public double myPow(double x, int n) {
        if(x==0) return 0;
        if(x==1 || n==0) return 1;
        long N = (long)n;
        return N>0? helper(x, N) : 1/helper(x,Math.abs(N));
    }
    public double helper(double x, long N){
        if(N == 1) return x;
        double rec = helper(x, N/2);
        return (N%2==0)? rec*rec:rec*rec*x;
    }
}