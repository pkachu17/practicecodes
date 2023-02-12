class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        ArrayList<Map.Entry<Integer, Integer>> temp = new ArrayList();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            temp.add(e);
        }
        
        Collections.sort(temp, (a,b)-> b.getValue().compareTo(a.getValue()));
        
        int[] result = new int[k];
        int count =0;
        
        for(Map.Entry<Integer, Integer> i : temp){
            if(count < k){
                result[count] = i.getKey();
                count++;
            }
        }
        return result;
        
    }
}