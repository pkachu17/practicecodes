class Solution {
    boolean[][] seen;
    public int maxAreaOfIsland(int[][] grid) {
        seen = new boolean[grid.length][grid[0].length];
        int ans=0;
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                ans = Math.max(ans, area(grid, r, c));
            }
        }
        return ans;
    }
    public int area(int[][]grid, int r, int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || seen[r][c] || grid[r][c]==0) return 0;
        seen[r][c] = true;
        return (1+ area(grid, r+1,c) + area(grid, r, c+1) + area(grid, r-1, c) + area(grid, r, c-1));
    }
}