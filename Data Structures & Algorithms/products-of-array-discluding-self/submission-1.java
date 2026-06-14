class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []arr = new int[nums.length];
        arr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            arr[i]=arr[i+1]*nums[i];
        }
        int []res= new int[nums.length];
        res[0]=arr[1];
        for(int i=1;i<nums.length-1;i++){
            res[i]=nums[i-1]*arr[i+1];
            nums[i]=nums[i]*nums[i-1];
        }
        res[nums.length-1]=nums[nums.length-2];
        return res;
    }
}  
