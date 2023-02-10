class Solution {
    public char repeatedCharacter(String s) {
        char c = 'a';
        HashSet<Character> set = new HashSet();
        for(int i=0; i<s.length(); i++){
            if(set.add(s.charAt(i))) continue;
            else return s.charAt(i);
        }
        return c;
    }
}