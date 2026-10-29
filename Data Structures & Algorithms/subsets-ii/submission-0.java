class Solution {
    public void subSet(int[] nums,List<List<Integer>>al,List<Integer>temp,int i){
        if(i==nums.length){
            al.add(new ArrayList<>(temp));return;
        }
        temp.add(nums[i]);
        subSet(nums,al,temp,i+1);
        temp.remove(temp.size()-1);
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                subSet(nums,al,temp,j);return;
            }
        }
        subSet(nums,al,temp,nums.length);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        Arrays.sort(nums);
        subSet(nums,al,temp,0);
        return al;
    }
}
