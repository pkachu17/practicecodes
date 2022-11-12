class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack();
        HashMap<Character, Character> hm = new HashMap();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        
        for(int i=0; i<s.length(); i++){
            if(!hm.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                char ob = hm.get(s.charAt(i));
                if(stack.size() == 0 || stack.pop() != ob) return false;
            }
        }
        if(stack.size()>0) return false;
        return true;
    }
}