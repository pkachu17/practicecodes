class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length()==0) return list;
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtrack(digits, list , map, new StringBuilder(), 0);
        return list;
    }
    public void backtrack(String digits, List<String> list, HashMap<Character, String> map, StringBuilder cur, int index){
        if(index == digits.length()){
            list.add( cur.toString() );
            return;
        }
        String str = map.get(digits.charAt(index));
        for(int i=0; i<str.length(); i++){
            cur.append(str.charAt(i));
            backtrack(digits, list, map, cur, index+1);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}