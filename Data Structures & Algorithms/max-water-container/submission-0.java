class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1,res=0;        
        while(r>l){
            res=Math.max(res,Math.min(heights[l],heights[r])*(r-l));
            if(heights[l]>heights[r])r--;
            else l++;
        }
        return res;
    }
}
