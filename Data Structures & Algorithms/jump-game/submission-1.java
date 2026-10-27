class Solution {
    public boolean canJump(int[] nums) {
        int maxLen=0;
        for(int i=0;i<nums.length-1;i++){
            if (i > maxLen) {
                return false;
            }
            maxLen=Math.max(maxLen,i+nums[i]);
        }
        return maxLen>=nums.length-1?true:false;
    }
}
