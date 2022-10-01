class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int mincost = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        pq.offer(new int[]{0,0});
        Set<Integer> visited = new HashSet<>();
        while(visited.size() < n){
            int[] arr = pq.poll();
            int weight = arr[0];
            int curNode = arr[1];
            if(visited.contains(curNode)) continue;
            visited.add(curNode);
            mincost += weight;
            for(int nextNode=0; nextNode<n; nextNode++){
                if(!visited.contains(nextNode)){
                    int nextWeight = Math.abs(points[nextNode][0]-points[curNode][0])+ Math.abs(points[nextNode][1]-points[curNode][1]);
                    pq.offer(new int[]{nextWeight, nextNode});
                }
            }
        }
        return mincost;
    }
}