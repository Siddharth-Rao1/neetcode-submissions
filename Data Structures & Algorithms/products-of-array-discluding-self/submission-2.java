class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] suffix=new int[nums.length];
        suffix[nums.length-1]=nums[nums.length-1];
        int[] res=new int[nums.length];
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i];
        }
        int prefix=nums[0];
        res[0]=suffix[1];
        for(int i=1;i<nums.length-1;i++){
            res[i]=prefix*suffix[i+1];prefix=prefix*nums[i];
        }
        res[nums.length-1]=prefix;
        return res;
    }
}  
