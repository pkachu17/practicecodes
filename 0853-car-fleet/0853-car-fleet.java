class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length==1) return 1;
        Stack<Double> stack = new Stack();
        int[][] combine = new int [position.length][2];
        for(int i =0; i< position.length; i++){
            combine[i][0] = position[i];
            combine[i][1] = speed[i];
        }
        Arrays.sort(combine, java.util.Comparator.comparingInt(o->o[0]));
        for(int i=0; i<combine.length; i++){
            System.out.println("pos:"+combine[i][0]+", speed:"+combine[i][1]);
        }
        for(int i=combine.length-1; i>=0; i--){
            double curtime = (double) (target-combine[i][0]) / combine[i][1];
            if(!stack.isEmpty() && curtime <= stack.peek()){
                continue;
            } else{
                stack.push(curtime);
            }
        }
        return stack.size();
    }
}  