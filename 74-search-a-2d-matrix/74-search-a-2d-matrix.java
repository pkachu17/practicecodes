class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        int s = 0, e = r*c -1, mid = 0;
        
        while(s <= e)
        {
            mid = (s + e) /2;
            
            int val = matrix[mid/c][mid%c];
            
            if(val == target)
                return true;
            
            else if(val > target)
            {
                e = mid - 1;
            }
            else 
            {
                s = mid + 1;
            }
        }
        return false;
    }
}