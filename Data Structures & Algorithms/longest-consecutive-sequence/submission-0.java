class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> al = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            int temp=1;int k=nums[i]+1;
            while(al.contains(k)){
                temp++;k++;
            }
            res=Math.max(res,temp);
        }
        return res;
    }
}
