
class Solution {
    public void sum(List<List<Integer>>al,List<Integer>temp,int[] nums,
    int i,int sum,int target){
        if(sum==target){
            al.add(new ArrayList<>(temp));return;
        }
        if(i>=nums.length||sum>target)return ;
        
        temp.add(nums[i]);
        sum(al,temp,nums,i+1,sum+nums[i],target);
        temp.remove(temp.size()-1);
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                sum(al,temp,nums,j,sum,target);return;
            }
        }
        sum(al,temp,nums,nums.length,sum,target);
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>>al=new LinkedList<>();
        List<Integer>temp=new ArrayList<>();
        Arrays.sort(nums);
        sum(al,temp,nums,0,0,target);
        return al;
    }
}
