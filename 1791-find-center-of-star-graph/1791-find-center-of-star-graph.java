class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        int[] vis = new int[n+2];
        for(int[] edge : edges){
            vis[edge[0]]++;
            vis[edge[1]]++;
        }
        int max =-1, ans=0;
        for(int i=0; i<n+2; i++){
            if(max<vis[i]){
                max = vis[i];
                ans=i;
            }
        }
        return ans;
        
    }
}