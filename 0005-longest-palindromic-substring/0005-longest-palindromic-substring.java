class Solution {
    public String longestPalindrome(String s) {
        
        
        
        int max = Integer.MIN_VALUE, left = 0, right = 0;
        for(int i = 0; i < s.length(); ++i)
        {
            int l1 = helper(s, i,i);
            int l2 = helper(s, i , i + 1);
            
            
            int l = Math.max(l1, l2);

            
            if(l >= max)
            {
                left = i - ((l-1)/2);
                right = i + (l/2); 
                
                max = l;
            }
        }
    
        
        String res = s.substring(left, right + 1);
        return res;
    }
    
    public int helper(String s, int st, int e)
    {
        while( st >= 0 && e < s.length() && s.charAt(st) == s.charAt(e))
        {
            --st;
            ++e;
        }
        return e-st-1;
    }
}