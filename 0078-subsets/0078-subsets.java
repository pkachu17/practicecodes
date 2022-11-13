class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listt = new ArrayList<>();
        // Arrays.sort(nums);
        List<Integer> ans =  new ArrayList<Integer>();
        backTrack(nums, listt, ans, 0);
        return listt;
    }
    
    public void backTrack(int[] nums, List<List<Integer>> listt, List<Integer> cur, int index){
        listt.add(new ArrayList<>(cur));
        for(int i=index; i<nums.length; i++){
            cur.add(nums[i]);
            backTrack(nums, listt, cur, ++index);
            cur.remove(cur.size()-1);
        } 
    }
}