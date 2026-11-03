class Solution {
    public int maxArea(int[] heights) {
        int low=0,high=heights.length-1,res=0;
        while(high>low){
            res=Math.max(res,Math.min(heights[low],heights[high])*(high-low));
            if(heights[high]>heights[low]){
                low++;
            }else{
                high--;
            }
        }
        return res;
    }
}
