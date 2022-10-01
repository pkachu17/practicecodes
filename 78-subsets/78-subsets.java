class Solution {
    
    List<List<Integer>> output = new ArrayList();
    int n;
    int k;
    
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for(k=0; k<n+1; k++){
            backtrack(0, new ArrayList<Integer>(), nums);
        }
        return output;
    }
    
    public void backtrack(int first, ArrayList<Integer> cur, int[] nums){
        if(cur.size() == k){
            output.add(new ArrayList(cur));
            return;
        }
        for(int i=first; i<n; i++){
            cur.add(nums[i]);
            backtrack(i+1, cur, nums);
            cur.remove(cur.size()-1);
        }
    }
}