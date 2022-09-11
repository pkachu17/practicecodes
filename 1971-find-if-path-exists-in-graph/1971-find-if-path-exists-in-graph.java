class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList();
        }
        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        return hasPath(graph, source, destination, visited);
    }
    public boolean hasPath(ArrayList<Integer>[] graph, int source, int destination, boolean[] visited){
        if(source==destination) return true;
        ArrayDeque<Integer> q = new ArrayDeque();
        q.add(source);
        while(q.size()>0){
            int temp = q.remove();
            if(!visited[temp]){
                visited[temp] = true;
                for(int nbr : graph[temp]){
                    if(nbr == destination){
                        return true;
                    }
                    q.add(nbr);
                }
            }
            else{
                continue;
            }
        }
        return false;
    }
}