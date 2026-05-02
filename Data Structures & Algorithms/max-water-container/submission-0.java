class Solution {
    public int maxArea(int[] heights) {
        int size = heights.length;
        int lo=0;
        int hi=size-1;
        int res=0;
        while(lo<hi){
            int sum = (hi-lo)*Math.min(heights[lo],heights[hi]);
            if(heights[lo]<heights[hi]){
                lo++;
            }else{hi--;}
        res = Math.max(res,sum);
        }
        
        return res;
    }
}
