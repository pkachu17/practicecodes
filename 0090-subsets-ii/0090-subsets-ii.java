class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums, new ArrayList<>(), ans);
        return ans;
    }
    
    public void helper(int p, int[] nums, List<Integer> q, List<List<Integer>> ans){
        ans.add(new ArrayList<>(q));
        for(int i = p; i<nums.length; i++){
            if(i!=p && nums[i] == nums[i-1]) continue;
            q.add(nums[i]);
            helper(i+1, nums, q, ans);
            q.remove(q.size()-1);
        }
    }
}