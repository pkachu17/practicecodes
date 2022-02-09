class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    int l=0;
    int r=arr.length-k;
    List<Integer> res= new ArrayList<Integer>();
   
    while(l<r){
        int m = (l+r)/2;
        
        if((x-arr[m])>(arr[m+k] -x))
        {
            l = m+1;
        }
        else
        {
            r=m;
        }
    }
    
    for(var i=l; i<(l+k);i++)
    {
        res.add(arr[i]);
    }
    
    return res;
    }
}