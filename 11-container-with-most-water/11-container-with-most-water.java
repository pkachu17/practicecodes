class Solution {
    public int maxArea(int[] height) {
        int maxarea =0;
        int l=0, r = height.length-1;
        while(l<r){
            int width = r-l;
            maxarea = Math.max(maxarea, Math.min(height[l], height[r])*width);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxarea;
    }
}