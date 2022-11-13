class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums);
        List<Integer> ans =  new ArrayList<Integer>();
        backTrack(nums, list, ans, 0);
        return list;
    }
    
    public void backTrack(int[] nums, List<List<Integer>> list, List<Integer> cur, int index){
        list.add(new ArrayList<>(cur));
        for(int i=index; i<nums.length; i++){
            cur.add(nums[i]);
            backTrack(nums, list, cur, i+1);
            cur.remove(cur.size()-1);
        } 
    }
}