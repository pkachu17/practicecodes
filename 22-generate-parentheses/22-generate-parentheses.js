/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
    var stack = [];
    var res = [];
    
    function backtrack(open, close){
        if((open&&close)==n){
            //res.push("");
            res.push(stack.join(""));
            return;
        }
        
        if(open<n){
            stack.push("(");
            backtrack(open+1, close);
            stack.pop();
        }
        
        if(close<open){
                stack.push(")");
                backtrack(open, close+1);
                stack.pop();
        }
    }
    backtrack(0,0);
    return res;
};