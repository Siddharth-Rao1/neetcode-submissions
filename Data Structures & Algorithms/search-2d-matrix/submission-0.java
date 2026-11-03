class Solution {
    public boolean search(int[]nums,int target){
        int high=nums.length-1,low=0;
        while(high>=low){
            int mid=(high+low)/2;
            if(nums[mid]==target)return true;
            else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(search(matrix[i],target)==true){
                return true;
            }
        }
        return false;
    }
}
