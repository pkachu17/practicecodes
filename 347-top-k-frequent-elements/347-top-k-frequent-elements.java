class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        ArrayList<Map.Entry<Integer, Integer>> temp = new ArrayList<>();
        
        for(int i : nums)
        {
            if(hm.containsKey(i))
            {
                hm.put(i, hm.get(i) + 1);
            }
            else
            {
                hm.put(i, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> e : hm.entrySet())
        {
            temp.add(e);
        }
        
        Collections.sort(temp, (a,b) -> b.getValue().compareTo(a.getValue()));
        
        int[] res = new int[k];         
        int count = 0;
        for(Map.Entry<Integer, Integer> i : temp)
        {
            if(count >= k)
            {
                break;
            }
            res[count] = i.getKey();
            ++count;
        }
        return res;   
    }
}