class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==-1) return true;
        HashSet<Integer> set = new HashSet<>();
        
        while(!set.contains(n)){
            set.add(n);
            n=sumOfSq(n);
            if(n==1) return true;
        }
        return false;
    }
    
    public int sumOfSq(int n){
        int res =0;
        while(n!=0){
            int digit = n%10;
            digit = digit*digit;
            res = res+digit;
            n = n/10;
        }
        return res;
    }
}