class Solution {
    
    
    /* *********************** DFS *********************** */
//     public boolean canFinish(int numCourses, int[][] pre) {
//         List<List<Integer>> adj = new ArrayList<>();
        
//         for(int i = 0; i < numCourses; ++i)
//         {
//             adj.add(new ArrayList<>());
//         }
        
//         for(int[] i: pre)
//         {
//             adj.get(i[0]).add(i[1]);
//         }
        
//         int[] vis = new int[numCourses];
//         int[] dfsvis = new int[numCourses];
        
//         for(int i = 0; i < numCourses; ++i)
//         {
//             if(vis[i] == 0)
//                 if(!dfs(adj, i, vis, dfsvis))
//                     return false;
//         }
        
//         return true;
//     }
    
//     public boolean dfs(List<List<Integer>> adj, int node, int[] vis, int[] dfsVisited)
//     {
//         for(int i : adj.get(node))
//         {
//             if(vis[i] == 0)
//             {
//                 vis[i] = 1;
//                 dfsVisited[i] = 1;
//                 if(!dfs(adj, i, vis, dfsVisited))
//                     return false;
//             }
//             else if(dfsVisited[i] == 1)
//             {
//                 return false;
//             }
//         }
//         dfsVisited[node] = 0;
//         return true;
//     }
// }
    
    public boolean canFinish(int numCourses, int[][] pre) {
        int[] inDeg = new int[numCourses];
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < numCourses; ++i)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int[] i: pre)
        {
            adj.get(i[0]).add(i[1]);
        }
        
        for(int i = 0; i < numCourses; ++i)
        {
            for(int j : adj.get(i))
            {
                inDeg[j]++;
            }
        }
        
        Queue<Integer> s = new LinkedList<>();
        
        for(int i = 0; i < numCourses; ++i)
        {
            if(inDeg[i] == 0)
                s.add(i);
        }
        
        
        //BFS: Kahn's/TopoSort
        
        int count = 0;
        
        while(!s.isEmpty())
        {
            ++count;
            int node = s.remove();
            
            for(int n : adj.get(node))
            {
                --inDeg[n];
                if(inDeg[n] == 0)
                    s.add(n);
            }
        }
        
        return count == numCourses;
    }
}