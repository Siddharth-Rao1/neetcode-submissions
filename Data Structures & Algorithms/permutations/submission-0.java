class Solution {
    public void permutatation(int i,int[] nums,List<List<Integer>>al){
        if(i==nums.length){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int k=0;k<nums.length;k++){
                temp.add(nums[k]);
            }
            al.add(new ArrayList<>(temp));return;
        }
        for(int j=i;j<nums.length;j++){
            swap(j,i,nums);
            permutatation(i+1,nums,al);
            swap(j,i,nums);
        }
    }
    public void swap(int j,int i,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        permutatation(0,nums,al);
        return al;
    }
}
