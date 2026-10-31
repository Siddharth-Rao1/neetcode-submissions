class Solution {
    public long noOfbnana(int[]nums,int k){
        long res=0;
        for(int i=0;i<nums.length;i++){
            res=res+(long)Math.ceil((double)nums[i]/k);
        }
        return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>high)high=piles[i];
        }
        int low=1;
        while(low<=high){
            int mid=(high+low)/2;
            long hr=noOfbnana(piles,mid);
            if(hr<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
