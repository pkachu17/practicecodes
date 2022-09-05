class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> m = new HashSet<Integer>();
        for(int i=0; i<nums.length;i++){
            if(m.contains(nums[i])){
                return nums[i];
            }
            m.add(nums[i]);
        }
        return -1;
    }
}