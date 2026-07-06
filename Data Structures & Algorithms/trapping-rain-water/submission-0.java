class Solution {
    public int trap(int[] height) {
        int maxi=height[height.length-1],max=0,
        res=0;
        int right[] = new int[height.length];
        for(int i=height.length-1;i>=0;i--){
            if(maxi<height[i]){
                maxi=height[i];
            }
            right[i]=maxi;
        }
        for(int i=0;i<height.length;i++){  
            max=Math.max(max,height[i]);          
            if(max>right[i]){
                res=res+right[i]-height[i];
            }else{
                res=res+max-height[i];
            }            
        }    
        return res;
    }    
}
