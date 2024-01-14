class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap();
        for(String str : strs){
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(str);
        }
        
        return new ArrayList(map.values());
    }
}