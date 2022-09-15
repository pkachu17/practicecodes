class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        int[] res = new int[numCourses];
        int k = -1;
        List<List<Integer>> adj =new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i : prerequisites){
            adj.get(i[0]).add(i[1]);
        }
        for(int i=0; i<numCourses; i++){
            for(int j : adj.get(i)){
                indegree[j]++;
            }
        }
        Queue<Integer> s = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0){
                s.add(i);
            }
        }
        
        while(!s.isEmpty()){
            int node = s.remove();
            res[++k] = node;
            for(int n : adj.get(node)){
                indegree[n]--;
                if(indegree[n]==0){
                    s.add(n);
                }
            }
        }
        
        int[] newArr = new int[numCourses];
        int z = numCourses;
        for(int i = 0; i < numCourses; ++i)
        {
            newArr[i] = res[--z];
        }
        return (k + 1) == numCourses ? newArr : new int[0];
        
    }
}