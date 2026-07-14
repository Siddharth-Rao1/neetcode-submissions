class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        return Math.max(robber(nums,0,n-1),robber(nums,1,n));
    }
    public int robber(int[] nums,int start,int end){
        int prev=0,prev1=0;
        for(int i=start;i<end;i++){
            int curr=Math.max(prev,prev1+nums[i]);
            prev1=prev;
            prev=curr;            
        }
        return prev;
    }
}
