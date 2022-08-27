class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int max=0;
        
        HashSet<Character> hash_set = new HashSet<Character>();
        
        while(r<s.length()){
            if(!hash_set.contains(s.charAt(r))){
                hash_set.add(s.charAt(r));
                r++;
                max= Math.max(hash_set.size(), max);
            }else{
                hash_set.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}