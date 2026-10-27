class Solution {
    public int trap(int[] height) {
        int lmax=0,rmax=0,res=0;
        int l=0,r=height.length-1;
        while(r>l){
            if(lmax<height[l]){
                lmax=height[l];
            }
            if(rmax<height[r]){
                rmax=height[r];
            }
            if(lmax<rmax){
                res=res+(lmax-height[l]);l++;
            }else{
                res=res+(rmax-height[r]);r--;
            }
        }
        return res;
    }
}
