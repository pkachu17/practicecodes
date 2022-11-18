class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;
        int i ;
        for( i = 0; i < nums.length; ++i)
        {
            if(i > reach)
            {
                break;//cannot move forward
            }
            reach = Math.max(reach, i + nums[i]);
        }
        return i == nums.length;
    }
}