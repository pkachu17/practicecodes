class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] leftSmallest = new int[heights.length];
        int[] rightSmallest = new int[heights.length];
        leftSmallest[0] = -1;
        rightSmallest[heights.length-1] = heights.length;
        
        //Fill leftSmallest array
        for(int i=1; i<heights.length; i++){
            int p = i-1;
            
            while(p>=0 && heights[p] >= heights[i]){
                p = leftSmallest[p];
            }
            leftSmallest[i] = p;
        }
        
        //Fill rightSmallest array
        for(int i=heights.length-2; i>=0; i--){
            int p = i+1;
            while(p<heights.length && heights[p] >= heights[i]){
                p = rightSmallest[p];
            }
            rightSmallest[i] = p;
        }
        
        //Calculate area
        int maxArea=0;
        for(int i=0; i<heights.length; i++){
            maxArea = Math.max(maxArea, heights[i] * (rightSmallest[i] - leftSmallest[i] - 1));
        }
        return maxArea;
    }
}