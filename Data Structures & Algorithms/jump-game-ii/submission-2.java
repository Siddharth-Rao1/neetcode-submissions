class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)return 0;
        int maxInd=0,currEnd=0,c,cnt=0;
        for(int i=0;i<nums.length-1;i++){
            maxInd=Math.max(maxInd,i+nums[i]);
            if(i==currEnd){
                cnt++;
                currEnd=maxInd;
            }  
        }
        return cnt;
    }
}
