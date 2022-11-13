class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(nums, list, new ArrayList());
        return list;
    }
    public void backTrack(int[] nums, List<List<Integer>> list, List<Integer>temp){
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
        }
        
        for(int i=0; i<nums.length; i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backTrack(nums, list, temp);
            temp.remove(temp.size()-1);
        }
    }
}