class Solution {
    public int totalNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        if(n==0) return 0;
        
        char[][] ans = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = '.';
            }
        }
        helper(res, n, ans , 0);
        return res.size();
    }
    
    public void helper(List<List<String>> res, int n, char[][] ans, int row){
        if(row == n){
            res.add(helperToString(ans));
        }
        
        for(int col = 0; col<n; col++){
            if(isRowValid(res, ans, n, row, col)){
                ans[row][col] = 'Q';
                helper(res, n, ans, row+1);
                ans[row][col] = '.';
            }
        }
    }
    
    public boolean isRowValid(List<List<String>> res, char[][] ans, int n, int row, int col){
        for(int i=0; i<n; i++){
            if(ans[i][col] == 'Q') return false;
        }
        for(int i = row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(ans[i][j] == 'Q') return false;
        }
        for(int i = row-1, j=col+1; i>=0 && j<n; i--, j++){
            if(ans[i][j] == 'Q') return false;
        }
        return true;
    }
    
    public List<String> helperToString(char[][] ans){
        List<String> str = new ArrayList<>();
        
        for(char[] chr : ans){
            str.add(new String(chr));
        }
        return str;
    }
}