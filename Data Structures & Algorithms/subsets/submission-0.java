class Solution {
    public void subSet(int[] nums,List<List<Integer>>al,
    List<Integer>temp,int i){
        if(i==nums.length){
           al.add(new ArrayList<>(temp)); return;
        }    
        temp.add(nums[i]);
        subSet(nums,al,temp,i+1);
        temp.remove(temp.size()-1);
        subSet(nums,al,temp,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>al=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        subSet(nums,al,temp,0);
        return al;
    }
}
