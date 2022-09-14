class Solution {
    public int countComponents(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> myMap = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        int components =0;
        for(int i=0; i<n;i++){
            myMap.put(i, new ArrayList<>());
        }
        for(int[] edge:edges){
            myMap.get(edge[0]).add(edge[1]);
            myMap.get(edge[1]).add(edge[0]);
        }
        for(int i=0; i<n;i++){
            if(!visited.contains(i)){
                components++;
                dfs(i, myMap, visited);
            }
        }
        return components;
    }
    public void dfs(int i, HashMap<Integer, List<Integer>>myMap, HashSet<Integer> visited){
        visited.add(i);
        for(int node: myMap.get(i)){
            if(!visited.contains(node)){
                dfs(node, myMap, visited);
            }
        }
    }
}