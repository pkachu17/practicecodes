class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list = new ArrayList<>();
        backTrack(candidates, target, list, new ArrayList<>(), 0);
        return list;
    }
    public void backTrack(int[] candidates, int target, List<List<Integer>>list, List<Integer> cur, int index){
        if(target == 0) list.add(new ArrayList(cur));
        else if (target<0 || index >= candidates.length) return;
        else{
            cur.add(candidates[index]);
            backTrack(candidates, target-candidates[index], list, cur, index);
            cur.remove(cur.size()-1);
            backTrack(candidates, target, list, cur, index+1);
        }
    }
}