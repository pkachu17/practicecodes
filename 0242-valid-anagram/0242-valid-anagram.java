class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        int[] arr = new int[26];
        
        for(int i=0; i<s.length(); i++){
            arr[str1[i]-97]++;
        }
        
        for(int i=0; i<t.length(); i++){
            arr[str2[i]-97]--;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0) return false;
        }
        
        return true;
    }
}