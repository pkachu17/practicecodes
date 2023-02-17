class Solution {
    public boolean checkInclusion(String s1, String s2) {
        s1 = Sort(s1);
        for(int i=0; i<=s2.length()-s1.length(); i++){
            if(s1.equals(Sort(s2.substring(i, i+s1.length())))) return true;
        }
        return false;
    }
    public String Sort(String s){
        char[] ca = s.toCharArray();
        Arrays.sort(ca);
        return new String(ca);
    }
}