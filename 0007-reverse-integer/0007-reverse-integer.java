class Solution {
    public int reverse(int x) {
        boolean neg = x<0;
        x = Math.abs(x);
        int num = 0;
        while(x>0){
            if((Integer.MAX_VALUE/10) < num) return 0;
            num = num*10 + x%10;
            x = x/10;
        }
        return neg? -num:num;
    }
}