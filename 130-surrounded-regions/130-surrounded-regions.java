class Solution {
    public void solve(char[][] board) {
        int nRow = board.length;
        int nCol = board[0].length;
        
        for(int i=0; i<nCol; i++){
            if(board[0][i]=='O') dfs(board, 0, i);
            if(board[nRow-1][i]=='O') dfs(board, nRow-1, i);
        }
        
        for(int i=0; i<nRow; i++){
            if(board[i][0]=='O') dfs(board, i, 0);
            if(board[i][nCol-1]=='O') dfs(board, i, nCol-1);
        }
        
        for(int r=0; r<nRow; r++){
            for(int c=0; c<nCol; c++){
                if(board[r][c]=='O') board[r][c]='X';
                if(board[r][c]=='T') board[r][c]='O';
            }
        }
    }
    public void dfs(char[][] board, int r, int c){
        if(r<0||c<0||r>=board.length||c>=board[0].length||board[r][c]!='O') return;
        board[r][c]='T';
        dfs(board, r+1, c);
        dfs(board, r-1, c);
        dfs(board, r, c+1);
        dfs(board, r, c-1);
    }
}