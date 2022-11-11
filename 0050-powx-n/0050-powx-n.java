class Solution {
    public double myPow(double x, int n) {
        
        if(x == 0)
            return 0;
        
        if(x == 1 || n == 0)
            return 1;

        long N = (long)n;
        
        return N > 0 ? helper(x, N) : 1/helper(x,Math.abs(N));
         
    }
    public double helper(double x, Long n)
    {
        if(n == 1)
            return x;
        
        double rec = helper(x, n/2);
        
      
        
        return (n%2 == 0) ? rec * rec : rec * rec * x;
    }
}