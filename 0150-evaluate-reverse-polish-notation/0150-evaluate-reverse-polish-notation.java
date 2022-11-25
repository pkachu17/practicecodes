class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){
                stack.add(stack.pop() + stack.pop());
            }
            else if(token.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                b = b-a;
                stack.add(b);
            }
            else if(token.equals("*")){
                stack.add(stack.pop() * stack.pop());
            }
            else if(token.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                b = b/a;
                stack.add(b);
            }
            else{
                stack.add(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}