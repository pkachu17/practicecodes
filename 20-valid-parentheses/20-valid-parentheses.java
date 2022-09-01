class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<Character>();
        
        Map <Character, Character> hm = new HashMap<Character, Character>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        
        for(int i=0; i<s.length(); i++){
            char tmp = s.charAt(i);
            if(!hm.containsKey(tmp)){
                stack.push(tmp);
            }else{
                char ob = hm.get(tmp);
                if(stack.size()==0 || stack.pop()!=ob) return false;
            }
        }
        if(stack.size()>0) return false;
        return true;
    }
}
