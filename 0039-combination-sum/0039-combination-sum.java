class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backTrack(candidates, target, ans, cur, 0);
        return ans;
    }
    public void backTrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> cur, int index){
        if(target == 0) ans.add(new ArrayList<>(cur));
        else if(target < 0 || index >= candidates.length) return;
        else{
            cur.add(candidates[index]);
            backTrack(candidates, target-candidates[index], ans, cur, index);
            cur.remove(cur.get(cur.size()-1));
            backTrack(candidates, target, ans, cur, index+1);
        }
    }
}