class Solution {
    public void sum(List<List<Integer>>al,List<Integer>temp,int[] nums,
    int i,int sum,int target){
        if(i>=nums.length||sum>target)return ;
        if(sum==target){
            al.add(new ArrayList<>(temp));return;
        }
        temp.add(nums[i]);
        sum(al,temp,nums,i,sum+nums[i],target);
        temp.remove(temp.size()-1);
        sum(al,temp,nums,i+1,sum,target);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>al=new LinkedList<>();
        List<Integer>temp=new ArrayList<>();
        sum(al,temp,nums,0,0,target);
        return al;
    }
}
