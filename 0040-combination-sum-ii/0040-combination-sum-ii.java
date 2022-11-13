class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        backTrack(candidates, target, list, new ArrayList(), 0);
        return list;
    }
    
    public void backTrack(int[] candidates, int target, List<List<Integer>> list, List<Integer> cur, int index){
        if(target == 0) list.add(new ArrayList(cur));
        else if(target < 0 || index > candidates.length) return;
        else{
            for(int i = index; i<candidates.length; i++){
                if( i>index && candidates[i] == candidates[i-1]) continue;
                cur.add(candidates[i]);
                backTrack(candidates, target - candidates[i], list, cur, i+1);
                cur.remove(cur.size()-1);
            }
        }
    }
}