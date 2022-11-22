class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] i : prerequisites){
            adj.get(i[0]).add(i[1]);
        }
        
        int[] visited = new int[numCourses];
        int[] dfsVisited = new int[numCourses];
        
        for(int i=0; i<numCourses; i++){
            if(visited[i]==0)
                if(!dfs(adj, visited, dfsVisited, i))
                    return false;
        }
        return true;
    }
    public boolean dfs(List<List<Integer>> adj, int[] visited, int[] dfsVisited, int node){
        for(int i : adj.get(node)){
            if(visited[i]==0){
                visited[i]=1;
                dfsVisited[i]=1;
                if(!dfs(adj, visited, dfsVisited, i))
                    return false;
            }else if( dfsVisited[i]==1)
                return false;
        }
        dfsVisited[node]=0;
        return true;
    }
}