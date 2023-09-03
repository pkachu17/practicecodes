class Solution {
    public boolean isAnagram(String s, String t) {
        
        // s = Sort(s);
        // t = Sort(t);
        // if(s.equals(t)){
        //     return true;
        // }
        // return false;
        
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int[] arr = new int[26];
        
        for(int i=0; i<s.length(); i++){
            arr[s1[i]-97]++;
        }
        
        for(int i=0; i<t.length(); i++){
            arr[t1[i]-97]--;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0) return false;
        }
        
        return true;
        
    }
    public String Sort(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}