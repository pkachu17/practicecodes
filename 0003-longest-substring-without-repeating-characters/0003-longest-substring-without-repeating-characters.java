class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, max=0;
        HashSet<Character> set = new HashSet<>();
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}