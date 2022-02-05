/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    var stack =[];
    if (s.length==0) return false;
    if ((s.length ==0)||s.length==1) return false;
    for(var i=0; i<s.length; i++){
        if(s[i]=="}"||s[i]==")"||s[i]=="]"){
            if(stack.length==0) return false;
            if(s[i]=="}" && stack[stack.length-1] != "{") return false;
            if(s[i]==")" && stack[stack.length-1] != "(") return false;
            if(s[i]=="]" && stack[stack.length-1] != "[") return false;
            stack.pop();
        }else{
            stack.push(s[i]);
        }
    }
    if(stack.length==0) return true;
    return false;
};