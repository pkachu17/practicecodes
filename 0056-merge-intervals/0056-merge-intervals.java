class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        LinkedList<int[]> res = new LinkedList<>();
        
        for(int[] i : intervals){
            if(res.isEmpty() || res.getLast()[1] < i[0]){
                res.add(i);
            }else{
                res.getLast()[1] = Math.max(res.getLast()[1], i[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}